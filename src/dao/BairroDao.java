/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.BairroModelo;

/**
 *
 * @author Usuario
 */
public class BairroDao implements InterfaceDao {

    
    String sql; 
    PreparedStatement pStm; 
    ResultSet resultado; 
    
    @Override
    public void salvarDao(Object... obj) {
        BairroModelo bmo = (BairroModelo)obj[0]; 
        
        /*
        if (bmo.getId() == 0){
            sql  = "INSERT INTO bairro (bairro, descricao) VALUES (? , ?)";
        } else {
            sql  = "UPDATE bairro SET bairro =?, descricao =? WHERE id_bairro =?";
        }
        */
        
        if (bmo.getId() == 0){
            sql  = "INSERT INTO bairro (bairro) VALUES (?)";
        } else {
            sql  = "UPDATE bairro SET bairro =? WHERE id_bairro =?";
        }
        
        try {
            //preparando a conexão e manipulando os dados
            pStm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            pStm.setString(1, bmo.getNome());
            
            //pStm.setString(2, bmo.getDescricao());
            
            if (bmo.getId() > 0) pStm.setInt(2, bmo.getId()); 
            
            pStm.execute();
            
            pStm.close();
            
            JOptionPane.showMessageDialog(null, "Registro Gravado.");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Falha ao gravar o registro." + e);
        
        }
        
        
    }

    @Override
    public void excluirDao(int id) {
        sql = "DELETE FROM bairro WHERE id_bairro=?"; 
        
        try {
            pStm = ConexaoBanco.abreConexao().prepareStatement(sql);
            pStm.setInt(1, id);
            pStm.execute(); 
            pStm.close();
            JOptionPane.showMessageDialog(null, "Registro Excluído com Sucesso!");
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar excluir o registro: " + e);
        }
    }

    @Override
    public void consultarDao(Object... obj) throws SQLException {
        DefaultTableModel tabela = (DefaultTableModel) obj[1];  
        
        if ("".equals((String) obj[0])){
            sql = "SELECT * FROM bairro";
        } else {
            sql = "SELECT * FROM bairro WHERE descricao LIKE '%"+obj[0]+"%'";  // '%pesquisa%'
        }
        
        
        pStm = ConexaoBanco.abreConexao().prepareStatement(sql);
        resultado = pStm.executeQuery(); 
        
        while (resultado.next()) {
        
            tabela.addRow(
            
                    new Object[] {
                     resultado.getInt("id_bairro"),
                     resultado.getString("bairro")
                    } 
            );
        }
        
        pStm.close(); 
    }

    @Override
    public void carregarComboBox(JComboBox itens) throws SQLException {
        
    }
    
}
