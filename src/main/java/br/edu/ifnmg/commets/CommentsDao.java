/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.commets;

import br.edu.ifnmg.book.Book;
import br.edu.ifnmg.book.BookDao;
import br.edu.ifnmg.reader.Reader;
import br.edu.ifnmg.reader.ReaderDao;
import br.edu.ifnmg.repository.Dao;
import br.edu.ifnmg.repository.DbConnection;
import static br.edu.ifnmg.repository.DbConnection.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

/**
 *
 * @author joaok
 */
public class CommentsDao extends Dao<Comments> {

    public static final String TABLE = "comments";

    @Override
    public String getSaveStatement() {
        return "insert into " + TABLE + " (comments, book_id, reader_id) values(?,?,?)";
    }

    @Override
    public String getUpdateStatement() {
        return "update " + TABLE + " set comments = ?, book_id = ?, reader_id = ? where id = ?";
    }

    @Override
    public String getFindByIdStatement() {
        return "select comments, book_id, reader_id, id from " + TABLE + " where id = ?";
    }

    @Override
    public String getFindAllStatement() {
        return "select * from " + TABLE;
    }

    @Override
    public String getDeleteStatement() {
        return "delete from " + TABLE + " where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Comments comments) {
        try {
            if (comments.getComentarios() != null) {
                pstmt.setObject(1, comments.getComentarios(), Types.VARCHAR);
            }
            if (comments.getBook().getId() != null) {
                pstmt.setObject(2, comments.getBook().getId(), Types.BIGINT);
            }
            if (comments.getReader().getId() != null) {
                pstmt.setObject(3, comments.getReader().getId(), Types.BIGINT);
            }
            if (comments.getId() != null) {
                pstmt.setObject(4, comments.getId(), Types.BIGINT);
            }
        } catch (Exception ex) {
            System.out.println("Exception in ComposeSave or Update " + ex);
        }
    }

    public Comments findByid(Long id) throws Exception {

        String sql = "SELECT comments, book_id, reader_id, id"
                + " FROM " + TABLE
                + " WHERE id = ?";

        PreparedStatement pstmt = getConnection().prepareStatement(sql);
        pstmt.setLong(1, id);

        ResultSet resultSet = pstmt.executeQuery();

        if (resultSet.next()) {
            Comments comments = new Comments();
            comments.setId(resultSet.getLong("id"));
            comments.setComentarios(resultSet.getString("comments"));

            Book book = new BookDao().findById(resultSet.getLong("book_id"));
            comments.setBook(book);

            Reader reader = new ReaderDao().findById(resultSet.getLong("reader_id"));
            comments.setReader(reader);

            return comments;
        } else {
            return null;
        }
    }

    @Override
    public Comments extractObject(ResultSet rs) {
        Comments comments = null;
        try {
            comments = new Comments();
            comments.setComentarios(rs.getString("comments"));
            comments.setId(rs.getLong("id"));
            Book book = new BookDao().findById(rs.getLong("book_id"));
            comments.setBook(book);
            Reader reader = new ReaderDao().findById(rs.getLong("reader_id"));
            comments.setReader(reader);
        } catch (Exception ex) {
            System.out.println("Exception in extractObject: " + ex);
        }
        return comments;
    }

    @Override
    public void delete(Long id) {

        try (PreparedStatement preparedStatement
                = DbConnection.getConnection().prepareStatement(getDeleteStatement())) {
            preparedStatement.setLong(1, id);

            System.out.println(">> SQL: " + preparedStatement);

            preparedStatement.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

    }
}
