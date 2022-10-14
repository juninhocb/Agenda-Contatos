
package visao;

import javax.swing.JFrame;
import util.PosicaoFormulario;

public class Principal extends javax.swing.JFrame {
    
    PosicaoFormulario form = new PosicaoFormulario(); 
    
    //Construtor
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpDesktop = new javax.swing.JDesktopPane();
        jmbBarraMenu = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiContatos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmCadastro = new javax.swing.JMenu();
        jmiCidade = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jmiBairro = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jmiTipoDeContato = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        setResizable(false);

        jdpDesktop.setPreferredSize(new java.awt.Dimension(5000, 5000));

        javax.swing.GroupLayout jdpDesktopLayout = new javax.swing.GroupLayout(jdpDesktop);
        jdpDesktop.setLayout(jdpDesktopLayout);
        jdpDesktopLayout.setHorizontalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5024, Short.MAX_VALUE)
        );
        jdpDesktopLayout.setVerticalGroup(
            jdpDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5000, Short.MAX_VALUE)
        );

        jmArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        jmArquivo.setMnemonic('A');
        jmArquivo.setText("Arquivo ");

        jmiContatos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jmiContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contato.png"))); // NOI18N
        jmiContatos.setText("Contatos");
        jmiContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiContatosActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiContatos);
        jmArquivo.add(jSeparator1);

        jmCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jmCadastro.setMnemonic('C');
        jmCadastro.setText("Cadastros");

        jmiCidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jmiCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cidade.png"))); // NOI18N
        jmiCidade.setText("Cidade");
        jmiCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCidadeActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiCidade);
        jmCadastro.add(jSeparator2);

        jmiBairro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmiBairro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bairro.png"))); // NOI18N
        jmiBairro.setText("Bairro");
        jmiBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBairroActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiBairro);
        jmCadastro.add(jSeparator3);

        jmiTipoDeContato.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmiTipoDeContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tipo.png"))); // NOI18N
        jmiTipoDeContato.setText("Tipo de Contato");
        jmiTipoDeContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTipoDeContatoActionPerformed(evt);
            }
        });
        jmCadastro.add(jmiTipoDeContato);

        jmArquivo.add(jmCadastro);

        jmbBarraMenu.add(jmArquivo);

        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/me.png"))); // NOI18N
        jmSobre.setMnemonic('S');
        jmSobre.setText("Sobre");
        jmSobre.setToolTipText("");
        jmbBarraMenu.add(jmSobre);

        setJMenuBar(jmbBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 5024, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiContatosActionPerformed
        // TODO add your handling code here:
        ContatoVisao tela; 
        form.abrirFormulario(tela = new ContatoVisao(), jdpDesktop);
        
    }//GEN-LAST:event_jmiContatosActionPerformed

    private void jmiCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCidadeActionPerformed
        CidadeVisao tela; 
        form.abrirFormulario(tela = new CidadeVisao(), jdpDesktop);
        
    }//GEN-LAST:event_jmiCidadeActionPerformed

    private void jmiBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBairroActionPerformed
        BairroVisao tela; 
        form.abrirFormulario(tela = new BairroVisao(), jdpDesktop); 
    }//GEN-LAST:event_jmiBairroActionPerformed

    private void jmiTipoDeContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTipoDeContatoActionPerformed
        /*
        TipoContatoVisao tela = new TipoContatoVisao();
        jdpDesktop.add(tela); 
        tela.setVisible(true);
        */
        TipoContatoVisao tela; 
        form.abrirFormulario(tela = new TipoContatoVisao(), jdpDesktop);
        
        
    }//GEN-LAST:event_jmiTipoDeContatoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JDesktopPane jdpDesktop;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbBarraMenu;
    private javax.swing.JMenuItem jmiBairro;
    private javax.swing.JMenuItem jmiCidade;
    private javax.swing.JMenuItem jmiContatos;
    private javax.swing.JMenuItem jmiTipoDeContato;
    // End of variables declaration//GEN-END:variables
}
