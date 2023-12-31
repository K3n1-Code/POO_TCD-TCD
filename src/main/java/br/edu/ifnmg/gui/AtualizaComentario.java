/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.gui.*;
import br.edu.ifnmg.commets.Comments;
import br.edu.ifnmg.commets.CommentsDao;
import br.edu.ifnmg.credential.Credential;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * @author joaok
 * @author ketsu
 */
public class AtualizaComentario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ComentariosLivro
     */
    private static AtualizaComentario instance;
    public static Credential cred = null;
//    private Long selectedCommentId;

    public AtualizaComentario() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        lblcomentado.setVisible(false);
        lblSelecione.setVisible(false);
        lblSoLeitores.setVisible(false);
        AtualizarComentariosTable();
        ocultarColunaId();
    }

    public static AtualizaComentario getInstance() {
        if (instance == null) {
            instance = new AtualizaComentario();
        }
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).jDesktop.add(instance);
        return instance;
    }
    
    private void ocultarColunaId() {
        int columnIndex = 0;
        TableColumn colunaId = tableComentarios.getColumnModel().getColumn(columnIndex);
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

        lblcomentado = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnComentar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextArea();
        lblSoLeitores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComentarios = new javax.swing.JTable();
        lblTdsLivros = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();

        setClosable(true);

        lblcomentado.setForeground(new java.awt.Color(0, 0, 255));
        lblcomentado.setText("Comentário Atualizado Com Sucesso!!");

        lblTitulo.setText("Novo Comentário:");

        btnComentar.setText("Comentar");
        btnComentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarActionPerformed(evt);
            }
        });

        txtComentario.setColumns(20);
        txtComentario.setRows(5);
        jScrollPane2.setViewportView(txtComentario);

        lblSoLeitores.setForeground(new java.awt.Color(240, 0, 0));
        lblSoLeitores.setText("Atualizar Comentários Apenas Para Leitores!!");

        tableComentarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Titulo", "Autor", "Comentários"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableComentarios);

        lblTdsLivros.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsLivros.setText("Meus Comentários ");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Comentário!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(lblTdsLivros, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(btnComentar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTitulo)
                                        .addGap(210, 210, 210)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSelecione)
                                .addGap(80, 80, 80))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSoLeitores)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblcomentado, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(39, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelecione)
                            .addComponent(lblTdsLivros))
                        .addGap(1, 1, 1)
                        .addComponent(lblSoLeitores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcomentado)
                        .addGap(18, 18, 18)
                        .addComponent(btnComentar)))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableComentarios.getSelectedRow();
        if (selectedRow != -1) {

            //            AtualizarComentarios(selectedCommentId);
            Long selectedId = (Long) tableComentarios.getValueAt(selectedRow, 0);
            AtualizarComentarios(selectedId);
            txtComentario.setText("");
            lblSelecione.setVisible(false);
            AtualizarComentariosTable();
        } else {
            System.out.println("Selecione um livro antes de adicionar um comentário.");
            lblSelecione.setVisible(true);
            lblcomentado.setVisible(false);
        }
    }//GEN-LAST:event_btnComentarActionPerformed

    private void AtualizarComentariosTable() {
        try {
            CommentsDao commentsDao = new CommentsDao();
            List<Comments> allComments = commentsDao.findAll();

            DefaultTableModel model = (DefaultTableModel) tableComentarios.getModel();
            model.setRowCount(0);

            for (Comments comments : allComments) {
                Long readerId = cred.getUser().getId();
                if (comments.getReader().getId().equals(readerId)) {
                    Object[] rowData = {
                        comments.getId(),
                        comments.getBook().getTitle(),
                        comments.getBook().getAuthors(),
                        comments.getComentarios()
                    };
                    model.addRow(rowData);

                    // Add a listener for the table
                    tableComentarios.getSelectionModel().addListSelectionListener(e -> {
                        int selectedRow = tableComentarios.getSelectedRow();
                        if (selectedRow != -1) {
                            
//                            selectedCommentId = comments.getId();  
                            String selectedComentario = (String) tableComentarios.getValueAt(selectedRow, 3);

                            txtComentario.setText(selectedComentario);

                            lblSelecione.setVisible(false);
                            lblSoLeitores.setVisible(false);
                            lblcomentado.setVisible(false);
                        }
                    });
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void AtualizarComentarios(Long selectedId) {
        try {
            if (selectedId != null) {
                String updatedComentario = txtComentario.getText();

                CommentsDao commentsDao = new CommentsDao();
                Comments selectedComment = commentsDao.findById(selectedId);

                if (selectedComment != null) {
                    selectedComment.setComentarios(updatedComentario);
                    commentsDao.saveOrUpdate(selectedComment);
                    System.out.println("Comentário atualizado com sucesso!");
                    lblcomentado.setVisible(true);
                } else {
                    System.out.println("Comentário não encontrado para atualização");
                }
            } else {
                System.out.println("Selecione um comentário antes de atualizá-lo");
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
            java.util.logging.Logger.getLogger(AtualizaComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizaComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizaComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizaComentario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizaComentario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComentar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblSoLeitores;
    private javax.swing.JLabel lblTdsLivros;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblcomentado;
    private javax.swing.JTable tableComentarios;
    private javax.swing.JTextArea txtComentario;
    // End of variables declaration//GEN-END:variables
}
