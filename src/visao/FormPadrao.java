/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import util.Tabela;

/**
 *
 * @author Usuario
 */
abstract public class FormPadrao extends javax.swing.JInternalFrame {
    
    //Metodos abstratos serão implementados pela classe filha
    abstract public void inicializarComponentes ();
    abstract public void salvarVisao();
    abstract public void criarTabela(); 
    abstract public void consultarVisao();
    abstract public void atualizarFormulario(); 
    abstract public void excluirVisao(); 
    
    // Atributos para criação a tabela
    JTable tabela; 
    DefaultTableModel modelo = new DefaultTableModel(); 
    
    // Instânciando o objecto para manipular a classe Tabela do pacote util
    Tabela utilTabela = new Tabela(); 
    
    JLabel jlConsulta;
    JTextField jtfConsulta; 
    
    
    
    //Construtor
    public FormPadrao() {
        initComponents();
        
        jbSalvar.setEnabled(false);
        jbCancelar.setEnabled(false);
        habilitaBotoes(true); 
        jtfId.setEnabled(false); 
        habilitaCampos(false);
        inicializarComponentes(); 
        criarTabela(); 
        
        //Criação de um JLabel 'na mão'
        jlConsulta = new JLabel("Consulta");
        jlConsulta.setBounds(9,10, 100, 25);
        jlConsulta.setForeground(Color.WHITE);
        Font font = new Font("Tahoma", Font.BOLD, 15); 
        jlConsulta.setFont(font);
        jpnConsulta.add(jlConsulta); 
        
        //Criação de um JTextField 'na mão'
        jtfConsulta = new JTextField(); 
        jtfConsulta.setBounds(80, 10, 710, 25);
        jpnConsulta.add(jtfConsulta);
                
         /*       
        jtfConsulta.addKeyListener(
                new KeyAdapter(){
                    public void keyReleased(KeyEvent e){
                        consultarVisao(); 
                    } 
                }
        );
        
        tabela.addKeyListener(
                new KeyAdapter(){
                    public void keyReleased(KeyEvent e){
                        atualizarFormulario();  
                    } 
                }
        );
        
              
        tabela.addMouseListener(
                new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        atualizarFormulario();  
                    } 
                }
        );
        
        
        */
        
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnBotoes = new javax.swing.JPanel();
        jbNovo = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbFechar = new javax.swing.JButton();
        jpnFormulario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jtfDescricao = new javax.swing.JTextField();
        jpnConsulta = new javax.swing.JPanel();

        jpnBotoes.setToolTipText("");

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/novo.png"))); // NOI18N
        jbNovo.setMnemonic('N');
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jbAlterar.setMnemonic('A');
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        jbExcluir.setMnemonic('E');
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        jbSalvar.setMnemonic('S');
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel.png"))); // NOI18N
        jbCancelar.setMnemonic('C');
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close.png"))); // NOI18N
        jbFechar.setMnemonic('F');
        jbFechar.setText("Fechar");
        jbFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnBotoesLayout = new javax.swing.GroupLayout(jpnBotoes);
        jpnBotoes.setLayout(jpnBotoesLayout);
        jpnBotoesLayout.setHorizontalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbExcluir)
                .addGap(84, 84, 84)
                .addComponent(jbSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCancelar)
                .addGap(92, 92, 92)
                .addComponent(jbFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnBotoesLayout.setVerticalGroup(
            jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNovo)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar)
                    .addComponent(jbFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("ID");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setText("Descrição");

        jtfId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout jpnFormularioLayout = new javax.swing.GroupLayout(jpnFormulario);
        jpnFormulario.setLayout(jpnFormularioLayout);
        jpnFormularioLayout.setHorizontalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnFormularioLayout.setVerticalGroup(
            jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jpnConsulta.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jpnConsultaLayout = new javax.swing.GroupLayout(jpnConsulta);
        jpnConsulta.setLayout(jpnConsultaLayout);
        jpnConsultaLayout.setHorizontalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnConsultaLayout.setVerticalGroup(
            jpnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jpnFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jpnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFecharActionPerformed

        dispose();
    }//GEN-LAST:event_jbFecharActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed

        habilitaBotoes(false);
        habilitaCampos(true);
        limpaDados();
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
       
        habilitaBotoes(false); 
        habilitaCampos(true);
        jtfDescricao.requestFocus();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
       
        habilitaBotoes(true);
        habilitaCampos(false);
        salvarVisao(); 
        consultarVisao(); 
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
      
        habilitaBotoes(true); 
        habilitaCampos(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
       
        if (JOptionPane.showConfirmDialog(null,
                "Deseja excluir o item selecionado?", 
                "Confirmação", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE
                ) == JOptionPane.YES_OPTION
            ) {
            excluirVisao();
            consultarVisao(); 
        } else {
            JOptionPane.showMessageDialog(null, "Exclusão Cancelada");
        } 
        
    }//GEN-LAST:event_jbExcluirActionPerformed

    
    
    public void habilitaBotoes(boolean estado){
        jbNovo.setEnabled(estado);
        jbAlterar.setEnabled(estado);
        jbExcluir.setEnabled(estado);
        jbSalvar.setEnabled(!estado);
        jbCancelar.setEnabled(!estado);
    }
    
    public void habilitaCampos(boolean estado){
        jtfDescricao.setEnabled(estado);
    }
    
    public void limpaDados(){
        jtfDescricao.setText(""); ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbFechar;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpnBotoes;
    public javax.swing.JPanel jpnConsulta;
    public javax.swing.JPanel jpnFormulario;
    public javax.swing.JTextField jtfDescricao;
    public javax.swing.JTextField jtfId;
    // End of variables declaration//GEN-END:variables
}
