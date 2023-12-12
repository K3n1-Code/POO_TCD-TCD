/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.credential.Credential;
import br.edu.ifnmg.credential.CredentialDao;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author joaok
 */
public class AtualizaUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form AtualizaUsuario
     */
    private static AtualizaUsuario instance;

    public AtualizaUsuario() {
        initComponents();
        // Centralização da janela
        //setLocationRelativeTo(null);
        lblAtualizado.setVisible(false);
        lblSelecione.setVisible(false);
        updateUsuarioTable();
        ocultarColunaId();
    }

    public static AtualizaUsuario getInstance() {
        if (instance == null) {
            instance = new AtualizaUsuario();
        }
        TelaPrincipal.getInstance(TelaPrincipal.current_cred).jDesktop.add(instance);
        return instance;
    }
    
    private void ocultarColunaId() {
        int columnIndex = 0;
        TableColumn colunaId = tableUsuario.getColumnModel().getColumn(columnIndex);
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

        txtAniversario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuario = new javax.swing.JTable();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        lblAtualizado = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        btnAtualiza = new javax.swing.JButton();
        lblPaginas = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblEdicao = new javax.swing.JLabel();
        lblSelecione = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblTdsUsuario = new javax.swing.JLabel();

        setClosable(true);

        tableUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Aniversário", "Papel"
            }
        ));
        jScrollPane1.setViewportView(tableUsuario);

        lblTitulo.setText("Nome:");

        lblAtualizado.setForeground(new java.awt.Color(0, 0, 255));
        lblAtualizado.setText("Usuário Atualizado Com Sucesso!!");

        lblAutor.setText("Email:");

        btnAtualiza.setText("Atualizar");
        btnAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaActionPerformed(evt);
            }
        });

        lblPaginas.setText("Data de Aniversário:");

        lblAno.setText("Usuário:");

        lblEdicao.setText("Senha:");

        lblSelecione.setForeground(new java.awt.Color(240, 0, 0));
        lblSelecione.setText("Selecione um Usuário");

        lblTdsUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTdsUsuario.setText("Usuários Cadrastrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAno)
                                        .addComponent(lblPaginas)
                                        .addComponent(lblEdicao)
                                        .addComponent(lblAutor))
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                    .addComponent(txtSenha)
                                    .addComponent(txtAniversario, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(lblAtualizado, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btnAtualiza))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(lblSelecione))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(lblTdsUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTdsUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAutor)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaginas)
                            .addComponent(txtAniversario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEdicao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblSelecione)
                        .addGap(7, 7, 7)
                        .addComponent(lblAtualizado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtualiza)
                        .addGap(9, 9, 9))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizaActionPerformed

    private void updateUsuarioTable() {
        try {
            ArrayList<Credential> credentialList = new CredentialDao().findAll();
            DefaultTableModel model = (DefaultTableModel) tableUsuario.getModel();
            model.setRowCount(0);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            for (Credential credential : credentialList) {
                String formattedDate = credential.getUser().getBirthDate().format(dateFormatter);
                Object[] rowData = {
                    credential.getId(),
                    credential.getUser().getName(),
                    credential.getUser().getEmail(),
                    formattedDate,
                    credential.getUser().getRole().getName(),
                };
                model.addRow(rowData);
            }

            // Add a listener for the table
            tableUsuario.getSelectionModel().addListSelectionListener(e -> {
                int selectedRow = tableUsuario.getSelectedRow();
                if (selectedRow != -1) {
                    String selectedId = String.valueOf(tableUsuario.getValueAt(selectedRow, 0));
                    String selectedNome = (String) tableUsuario.getValueAt(selectedRow, 1);
                    String selectedEmail = (String) tableUsuario.getValueAt(selectedRow, 2);
                    String selectedAniversario = String.valueOf(tableUsuario.getValueAt(selectedRow, 3));
                    String selectedPapel = (String) tableUsuario.getValueAt(selectedRow, 4);

                    txtNome.setText(selectedNome);
                    txtEmail.setText(selectedEmail);
                    txtAniversario.setText(selectedAniversario);

                    // Set the selected ID to a hidden field or use it as needed in your application
                    lblSelecione.setVisible(false);
                    lblAtualizado.setVisible(false);
                }
            });
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
            java.util.logging.Logger.getLogger(AtualizaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizaUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualiza;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAtualizado;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblEdicao;
    private javax.swing.JLabel lblPaginas;
    private javax.swing.JLabel lblSelecione;
    private javax.swing.JLabel lblTdsUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tableUsuario;
    private javax.swing.JTextField txtAniversario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
