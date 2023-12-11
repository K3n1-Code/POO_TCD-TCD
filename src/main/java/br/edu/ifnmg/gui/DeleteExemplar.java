/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.copy.Copy;
import br.edu.ifnmg.copy.CopyDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author joaok
 */
public class DeleteExemplar extends javax.swing.JFrame {

    /**
     * Creates new form DeleteLivro
     */
    private static DeleteExemplar instance;

    public DeleteExemplar() {
        initComponents();
        // Centralização da janela
        setLocationRelativeTo(null);
        lblDel.setVisible(false);
        lblSelecione.setVisible(false);
        DeleteCopyTable();
        ocultarColunaId();
    }

    public static DeleteExemplar getInstance() {
        if (instance == null) {
            instance = new DeleteExemplar();
        }
        instance.setAlwaysOnTop(true);
        return instance;
    }

    private void ocultarColunaId() {
        int columnIndex = 0;
        TableColumn colunaId = tableDelExemplar.getColumnModel().getColumn(columnIndex);
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

        lblTdsExemp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDelExemplar = new javax.swing.JTable();
        btnDelExemp = new javax.swing.JButton();
        lblDel = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Apagar Exemplares");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblTdsExemp.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsExemp.setText("Exemplares");

        tableDelExemplar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Livro", "Edição", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDelExemplar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tableDelExemplar);

        btnDelExemp.setText("Apagar Exemplares");
        btnDelExemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelExempActionPerformed(evt);
            }
        });

        lblDel.setForeground(new java.awt.Color(0, 0, 255));
        lblDel.setText("Exemplar Removido Com Sucesso!!");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Exemplar!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelExemp)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSelecione, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblTdsExemp)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTdsExemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSelecione)
                .addGap(4, 4, 4)
                .addComponent(lblDel)
                .addGap(18, 18, 18)
                .addComponent(btnDelExemp, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        lblSelecione.setVisible(false);
        lblDel.setVisible(false);
        this.setAlwaysOnTop(false);
        this.setVisible(false);
        //TelaPrincipal.getInstance(TelaPrincipal.current_cred).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btnDelExempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelExempActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableDelExemplar.getSelectedRow();
        if (selectedRow != -1) {
            Long selectedId = (Long) tableDelExemplar.getValueAt(selectedRow, 0);
            deleteCopy(selectedId);
            DeleteCopyTable();
            lblSelecione.setVisible(false);
            lblDel.setVisible(true);
            return;
        } else {
            System.out.println("Selecione um exemplar antes de deletar.");
            lblSelecione.setVisible(true);
        }

    }//GEN-LAST:event_btnDelExempActionPerformed

    private void DeleteCopyTable() {
        try {
            CopyDao copyDao = new CopyDao();
            List<Copy> copies = copyDao.findAll();

            DefaultTableModel model = (DefaultTableModel) tableDelExemplar.getModel();
            model.setRowCount(0);

            for (Copy copy : copies) {
                Object[] rowData = {
                    copy.getId(),
                    copy.getBook().getTitle(),
                    copy.getBook().getEdition(),
                    copy.isDisponivel()
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteCopy(Long selectedId) {
        try {
            if (selectedId != null) {
                new CopyDao().delete(selectedId);
                System.out.println("Exemplar '" + selectedId + "' deletado com sucesso!");
                lblSelecione.setVisible(false);
                lblDel.setVisible(true);

                // Atualiza a tabela após a exclusão
                DeleteCopyTable();
            } else {
                System.out.println("Selecione um exemplar antes de deletar.");
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
            java.util.logging.Logger.getLogger(DeleteExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteExemplar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteExemplar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelExemp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDel;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTdsExemp;
    private javax.swing.JTable tableDelExemplar;
    // End of variables declaration//GEN-END:variables
}
