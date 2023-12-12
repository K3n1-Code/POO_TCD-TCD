/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.book.Book;
import br.edu.ifnmg.book.BookDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author ketsu
 */
public class DeleteLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form DeleteLivro
     */
    private static DeleteLivro instance;

    public DeleteLivro() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        lblApagado.setVisible(false);
        lblSelecione.setVisible(false);
        DeleteBookTable();
        ocultarColunaId();
    }

    public static DeleteLivro getInstance() {
        if (instance == null) {
            instance = new DeleteLivro();
        }
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).jDesktop.add(instance);
        return instance;
    }

    private void ocultarColunaId() {
        int columnIndex = 0;
        TableColumn colunaId = tableDelLivro.getColumnModel().getColumn(columnIndex);
        colunaId.setMinWidth(0);
        colunaId.setMaxWidth(0);
        colunaId.setPreferredWidth(0);
        colunaId.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableDelLivro = new javax.swing.JTable();
        lblTdsLivros = new javax.swing.JLabel();
        lblApagado = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setClosable(true);

        tableDelLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Autor", "Páginas", "Ano", "Edição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDelLivro);

        lblTdsLivros.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsLivros.setText("Livros Cadrastrados");

        lblApagado.setForeground(new java.awt.Color(0, 0, 255));
        lblApagado.setText("Livro Apagado Com Sucesso!!");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Livro");

        btnDelete.setText("Apagar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSelecione)
                        .addGap(40, 40, 40)
                        .addComponent(btnDelete)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTdsLivros)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblApagado, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTdsLivros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(lblSelecione))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApagado)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableDelLivro.getSelectedRow();
        if (selectedRow != -1) {
            // Obtém o título da coluna 'Titulo' na linha clicada
            Long selectedId = (Long) tableDelLivro.getValueAt(selectedRow, 0);
            deleteBook(selectedId);
            DeleteBookTable();
        } else {
            System.out.println("Selecione um livro antes de deletar.");
            lblSelecione.setVisible(true);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void DeleteBookTable() {
        try {
            BookDao bookDao = new BookDao();
            List<Book> books = bookDao.findAll();

            DefaultTableModel model = (DefaultTableModel) tableDelLivro.getModel();
            model.setRowCount(0);

            for (Book book : books) {
                Object[] rowData = {
                    book.getId(),
                    book.getTitle(),
                    book.getAuthors(),
                    book.getPages(),
                    book.getYear(),
                    book.getEdition()
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteBook(Long selectedId) {
        try {
            if (selectedId != null) {
                new BookDao().delete(selectedId);
                System.out.println("Livro '" + selectedId + "' deletado com sucesso!");
                lblSelecione.setVisible(false);
                lblApagado.setVisible(true);

                // Atualiza a tabela após a exclusão
                DeleteBookTable();
            } else {
                System.out.println("Selecione um livro antes de deletar.");
                lblSelecione.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteLivro().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApagado;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTdsLivros;
    private javax.swing.JTable tableDelLivro;
    // End of variables declaration//GEN-END:variables
}
