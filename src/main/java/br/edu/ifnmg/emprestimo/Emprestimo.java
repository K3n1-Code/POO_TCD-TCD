/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.emprestimo;

import br.edu.ifnmg.book.Book;
import br.edu.ifnmg.copy.Copy;
import br.edu.ifnmg.copy.CopyDao;
import br.edu.ifnmg.entity.Entity;
import br.edu.ifnmg.librarian.Librarian;
import br.edu.ifnmg.reader.Reader;
import br.edu.ifnmg.user.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaok
 */
public final class Emprestimo extends Entity {

    private LocalDate diaEmprestimo;
    private LocalDate diaRetorno;
    private User librarian;
    private User reader;
    private List<Copy> copias;
            
    public Emprestimo() {
        copias = new ArrayList<>();
    }

    public Emprestimo(Long id, LocalDate diaEmprestimo, LocalDate diaRetorno, Librarian librarian, Reader reader)
    throws Exception {//Cria um empréstimo e logo o registra no banco de dados
        setId(id);
        setDiaEmprestimo(LocalDate.now());  // Security problem!
        setDiaRetorno(diaRetorno);  // Security problem!
        setLibrarian(librarian);  // Security problem!
        setReader(reader);
        copias = new ArrayList<>();
    }
    
    public Emprestimo(Long id, LocalDate diaRetorno, User librarian, User reader)
    throws Exception {//Cria um empréstimo e logo o registra no banco de dados
        setId(id);
        setDiaEmprestimo(LocalDate.now());  // Security problem!
        setDiaRetorno(diaRetorno);  // Security problem!
        setLibrarian(librarian);  // Security problem!
        setReader(reader);
        copias = new ArrayList<>();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters and setters">
    public Copy getCopy(int id) throws Exception{
        if(id<copias.size())
            return copias.get(id);
        else{
            Book book;
            book = new Book(null, "", "", (short) 1, (short) 1, (byte) 1);
            return new Copy(null, false, book , this);
        }
    }  
    public LocalDate getDiaEmprestimo() {
        return diaEmprestimo;
    }

    public void setDiaEmprestimo(LocalDate diaEmprestimo) {
        if (diaEmprestimo == null) {
            throw new IllegalArgumentException("Emprestimo: Data de empreestimo nula");
        } else {
            this.diaEmprestimo = diaEmprestimo;
        }
    }

    public LocalDate getDiaRetorno() {
        return diaRetorno;
    }

    public void setDiaRetorno(LocalDate diaRetorno) {
        if (diaRetorno == null) {
            throw new IllegalArgumentException("Emprestimo: Data de Retorno nula");
        } else {
            this.diaRetorno = diaRetorno;
        }
    }

    public User getLibrarian() {
        return librarian;
    }

    public void setLibrarian(User librarian) {
        this.librarian = librarian;
    }

    public User getReader() {
        return reader;
    }

    public void setReader(User reader) {
        this.reader = reader;
    }


//</editor-fold>
    
    public static void emprestar(LocalDate diaRetorno, User librarian, User reader, int[] SelectedRows) throws Exception{
        Emprestimo emp = new Emprestimo(null,diaRetorno,librarian,reader);
        EmprestimoDao dao = new EmprestimoDao();
        emp.setId(dao.saveOrUpdate(emp));
        CopyDao copyDao = new CopyDao();
        List<Copy> copies = copyDao.findAll();
        for(Integer row: SelectedRows){
            emp.copias.add(copies.get(row));
            copies.get(row).setEmprestimo(emp);
            copies.get(row).setDisponivel();
            copyDao.saveOrUpdate(copies.get(row));
        }
        
    };
    
        @Override
    public String toString() {
        return "Empreestimo{"
                + "diaEmprestimo=" + this.diaEmprestimo
                + ", diaRetorno=" + this.diaRetorno
                + ", librarian=" + this.librarian
                + ", reader=" + this.reader
                + '}';
    }

    public void addCopy(Copy copy) {
        copias.add(copy);
    }

}
