/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifnmg.gui;

import br.edu.ifnmg.credential.Credential;

/**
 *
 * @author joaok
 */
public class TelaPrincipal extends javax.swing.JFrame {

    public static Credential current_cred = null;
    /**
     * Creates new form TelaPrincipal
     */
    private static TelaPrincipal instance;

    public TelaPrincipal() {
        initComponents();
    }

    public static TelaPrincipal getInstance(Credential credential) {

        if (instance == null) {
            instance = new TelaPrincipal();
            //current_cred=credential;
        }

        //<editor-fold defaultstate="collapsed" desc="Ativação/Desativação de menus">
        // Escolha entre ocultar
        // Perceba que a própria classe pode ter acesso direto a seus atributos
        // privados. Por isso não houve um ...getMnuCadastroUsuario()
//        
        if (current_cred.getUser().getRole().getName().equals("administrador")) {
            instance.menuVerUsuario.setVisible(true);
            instance.menuAtualizaUsuario.setVisible(true);
            instance.menuSair.setVisible(true);
            instance.menuEncerrar.setVisible(true);
            instance.menuCadUsuario.setVisible(true);
            instance.menuCadLivro.setVisible(true);
            instance.menuAtualiza.setVisible(true);
            instance.menuComments.setVisible(true);
            instance.menuApagaLivro.setVisible(true);
            instance.menuAtuaComentarios.setVisible(true);
            instance.menuApagaComentario.setVisible(true);
            instance.menuCadExemp.setVisible(true);
            instance.menuAtualizaExemp.setVisible(true);
            instance.menuDeleteExemp.setVisible(true);
            instance.menuLivro.setVisible(true);
            instance.menuCadEmp.setVisible(true);
            instance.menuHistoryEmp.setVisible(true);
            instance.menuAutoEmp.setVisible(true);
            instance.setTitle("Library System - " + current_cred.getUser().getName());

        } else if (current_cred.getUser().getRole().getName().equals("bibliotecário")) {
            instance.menuVerUsuario.setVisible(true);
            instance.menuAtualizaUsuario.setVisible(false);
            instance.menuSair.setVisible(true);
            instance.menuEncerrar.setVisible(true);
            instance.menuCadUsuario.setVisible(false);
            instance.menuCadLivro.setVisible(true);
            instance.menuAtualiza.setVisible(true);
            instance.menuComments.setVisible(false);
            instance.menuApagaLivro.setVisible(true);
            instance.menuAtuaComentarios.setVisible(false);
            instance.menuApagaComentario.setVisible(false);
            instance.menuCadExemp.setVisible(true);
            instance.menuAtualizaExemp.setVisible(true);
            instance.menuDeleteExemp.setVisible(true);
            instance.menuLivro.setVisible(true);
            instance.menuCadEmp.setVisible(true);
            instance.menuHistoryEmp.setVisible(false);
            instance.menuAutoEmp.setVisible(false);
            instance.setTitle("Library System - " + current_cred.getUser().getName());

        } else if (current_cred.getUser().getRole().getName().equals("leitor")) {
            instance.menuVerUsuario.setVisible(true);
            instance.menuAtualizaUsuario.setVisible(false);
            instance.menuSair.setVisible(true);
            instance.menuEncerrar.setVisible(true);
            instance.menuCadUsuario.setVisible(false);
            instance.menuCadLivro.setVisible(false);
            instance.menuAtualiza.setVisible(false);
            instance.menuComments.setVisible(true);
            instance.menuApagaLivro.setVisible(false);
            instance.menuAtuaComentarios.setVisible(true);
            instance.menuApagaComentario.setVisible(true);
            instance.menuCadExemp.setVisible(false);
            instance.menuAtualizaExemp.setVisible(false);
            instance.menuDeleteExemp.setVisible(false);
            instance.menuLivro.setVisible(true);
            instance.menuCadEmp.setVisible(false);
            instance.menuHistoryEmp.setVisible(true);
            instance.menuAutoEmp.setVisible(true);
            instance.setTitle("Library System - " + current_cred.getUser().getName());

        }
        System.out.println(current_cred.getUser());

//        instance.menuCadLivro.setVisible(credential.getUser().getRole().getName().equals("biblioteca"));
//        instance.menuCadEmp.setVisible(credential.getUser().getRole().getName().equals("biblioteca"));
//        instance.setTitle("Library System - " + credential.getUser().getName());
        // ... ou desabilitar
        //</editor-fold>
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        PanelPrincipal = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        menuUsuario = new javax.swing.JMenu();
        menuVerUsuario = new javax.swing.JMenuItem();
        menuAtualizaUsuario = new javax.swing.JMenuItem();
        menuCadUsuario = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuEncerrar = new javax.swing.JMenuItem();
        menuBook = new javax.swing.JMenu();
        menuLivro = new javax.swing.JMenuItem();
        menuCadLivro = new javax.swing.JMenuItem();
        menuAtualiza = new javax.swing.JMenuItem();
        menuApagaLivro = new javax.swing.JMenuItem();
        menuCadExemp = new javax.swing.JMenuItem();
        menuAtualizaExemp = new javax.swing.JMenuItem();
        menuDeleteExemp = new javax.swing.JMenuItem();
        menuComments = new javax.swing.JMenuItem();
        menuAtuaComentarios = new javax.swing.JMenuItem();
        menuApagaComentario = new javax.swing.JMenuItem();
        menuEmpres = new javax.swing.JMenu();
        menuCadEmp = new javax.swing.JMenuItem();
        menuHistoryEmp = new javax.swing.JMenuItem();
        menuAutoEmp = new javax.swing.JMenuItem();
        menuEmpres1 = new javax.swing.JMenu();
        menuCadEmp1 = new javax.swing.JMenuItem();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(64, 64, 64));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        menu.setBackground(new java.awt.Color(64, 64, 64));
        menu.setBorder(null);
        menu.setBorderPainted(false);

        menuUsuario.setBackground(new java.awt.Color(70, 70, 70));
        menuUsuario.setText("Usuário");

        menuVerUsuario.setText("Usuário");
        menuVerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuVerUsuario);

        menuAtualizaUsuario.setText("Atualizar Usuários");
        menuAtualizaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizaUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuAtualizaUsuario);

        menuCadUsuario.setText("Cadrastro de Usuário");
        menuCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuCadUsuario);

        menuSair.setText("Sair da conta");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuUsuario.add(menuSair);

        menuEncerrar.setText("Fechar");
        menuEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEncerrarActionPerformed(evt);
            }
        });
        menuUsuario.add(menuEncerrar);

        menu.add(menuUsuario);

        menuBook.setBackground(new java.awt.Color(70, 70, 70));
        menuBook.setText("Livro");

        menuLivro.setText("Livros");
        menuLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivroActionPerformed(evt);
            }
        });
        menuBook.add(menuLivro);

        menuCadLivro.setText("Cadastrar Livro");
        menuCadLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadLivroActionPerformed(evt);
            }
        });
        menuBook.add(menuCadLivro);

        menuAtualiza.setText("Atualizar Livro");
        menuAtualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizaActionPerformed(evt);
            }
        });
        menuBook.add(menuAtualiza);

        menuApagaLivro.setText("Apagar Livro");
        menuApagaLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuApagaLivroActionPerformed(evt);
            }
        });
        menuBook.add(menuApagaLivro);

        menuCadExemp.setText("Adicionar Exemplar");
        menuCadExemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadExempActionPerformed(evt);
            }
        });
        menuBook.add(menuCadExemp);

        menuAtualizaExemp.setText("Atualizar Exemplar");
        menuAtualizaExemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtualizaExempActionPerformed(evt);
            }
        });
        menuBook.add(menuAtualizaExemp);

        menuDeleteExemp.setText("Apagar Exempar");
        menuDeleteExemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDeleteExempActionPerformed(evt);
            }
        });
        menuBook.add(menuDeleteExemp);

        menuComments.setText("Realizar Comentários");
        menuComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCommentsActionPerformed(evt);
            }
        });
        menuBook.add(menuComments);

        menuAtuaComentarios.setText("Atualizar Comentários");
        menuAtuaComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAtuaComentariosActionPerformed(evt);
            }
        });
        menuBook.add(menuAtuaComentarios);

        menuApagaComentario.setText("Apagar Comentários");
        menuApagaComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuApagaComentarioActionPerformed(evt);
            }
        });
        menuBook.add(menuApagaComentario);

        menu.add(menuBook);

        menuEmpres.setText("Empréstimo");

        menuCadEmp.setText("Realizar de Empréstimo");
        menuCadEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadEmpActionPerformed(evt);
            }
        });
        menuEmpres.add(menuCadEmp);

        menuHistoryEmp.setText("Historico Empréstimo");
        menuHistoryEmp.setBorderPainted(false);
        menuHistoryEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHistoryEmpActionPerformed(evt);
            }
        });
        menuEmpres.add(menuHistoryEmp);
        menuHistoryEmp.getAccessibleContext().setAccessibleName("");

        menuAutoEmp.setText("Autoriza Empréstimo");
        menuEmpres.add(menuAutoEmp);

        menu.add(menuEmpres);

        menuEmpres1.setText("Ajuda");

        menuCadEmp1.setText("Sobre");
        menuCadEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadEmp1ActionPerformed(evt);
            }
        });
        menuEmpres1.add(menuCadEmp1);

        menu.add(menuEmpres1);

        setJMenuBar(menu);
        menu.getAccessibleContext().setAccessibleName("Library System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelPrincipal.getAccessibleContext().setAccessibleName("Library System");

        getAccessibleContext().setAccessibleName("Library System");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        Login.getInstance().setVisible(true);

    }//GEN-LAST:event_formWindowClosed

    private void menuVerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerUsuarioActionPerformed

    }//GEN-LAST:event_menuVerUsuarioActionPerformed

    private void menuHistoryEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHistoryEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuHistoryEmpActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        Login.getInstance().setVisible(true);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadUsuarioActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        CadrastroUsuario.getInstance().setVisible(true);
    }//GEN-LAST:event_menuCadUsuarioActionPerformed

    private void menuCadEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadEmpActionPerformed
        EmprestarLivro.getInstance().setVisible(true);
    }//GEN-LAST:event_menuCadEmpActionPerformed

    private void menuCadLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadLivroActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        CadastroLivro.getInstance().setVisible(true);
    }//GEN-LAST:event_menuCadLivroActionPerformed

    private void menuApagaLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuApagaLivroActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        DeleteLivro.getInstance().setVisible(true);
    }//GEN-LAST:event_menuApagaLivroActionPerformed

    private void menuEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEncerrarActionPerformed
        // TODO add your handling code here:
        // Close the program
        System.exit(0);
    }//GEN-LAST:event_menuEncerrarActionPerformed

    private void menuCadEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadEmp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadEmp1ActionPerformed

    private void menuAtualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizaActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        AtualizaLivro.getInstance().setVisible(true);
    }//GEN-LAST:event_menuAtualizaActionPerformed

    private void menuCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCommentsActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        Comentarios.getInstance().setVisible(true);
    }//GEN-LAST:event_menuCommentsActionPerformed

    private void menuAtualizaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizaUsuarioActionPerformed
        AtualizaUsuario.getInstance().setVisible(true);
    }//GEN-LAST:event_menuAtualizaUsuarioActionPerformed

    private void menuCadExempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadExempActionPerformed
        AdicionarExemplar.getInstance().setVisible(true);
    }//GEN-LAST:event_menuCadExempActionPerformed

    private void menuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivroActionPerformed
        VisualizarLivros.getInstance().setVisible(true);
    }//GEN-LAST:event_menuLivroActionPerformed

    private void menuAtuaComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtuaComentariosActionPerformed
        // TODO add your handling code here:
        AtualizarComentarios.getInstance().setVisible(true);
    }//GEN-LAST:event_menuAtuaComentariosActionPerformed

    private void menuApagaComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuApagaComentarioActionPerformed
        // TODO add your handling code here:
        DeleteComentarios.getInstance().setVisible(true);
    }//GEN-LAST:event_menuApagaComentarioActionPerformed

    private void menuDeleteExempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDeleteExempActionPerformed
        // TODO add your handling code here:
        DeleteExemplar.getInstance().setVisible(true);
    }//GEN-LAST:event_menuDeleteExempActionPerformed

    private void menuAtualizaExempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAtualizaExempActionPerformed
        // TODO add your handling code here:
        AtualizarExemplar.getInstance().setVisible(true);
    }//GEN-LAST:event_menuAtualizaExempActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem menuApagaComentario;
    private javax.swing.JMenuItem menuApagaLivro;
    private javax.swing.JMenuItem menuAtuaComentarios;
    private javax.swing.JMenuItem menuAtualiza;
    private javax.swing.JMenuItem menuAtualizaExemp;
    private javax.swing.JMenuItem menuAtualizaUsuario;
    private javax.swing.JMenuItem menuAutoEmp;
    private javax.swing.JMenu menuBook;
    private javax.swing.JMenuItem menuCadEmp;
    private javax.swing.JMenuItem menuCadEmp1;
    private javax.swing.JMenuItem menuCadExemp;
    private javax.swing.JMenuItem menuCadLivro;
    private javax.swing.JMenuItem menuCadUsuario;
    private javax.swing.JMenuItem menuComments;
    private javax.swing.JMenuItem menuDeleteExemp;
    private javax.swing.JMenu menuEmpres;
    private javax.swing.JMenu menuEmpres1;
    private javax.swing.JMenuItem menuEncerrar;
    private javax.swing.JMenuItem menuHistoryEmp;
    private javax.swing.JMenuItem menuLivro;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenuItem menuVerUsuario;
    // End of variables declaration//GEN-END:variables
}
