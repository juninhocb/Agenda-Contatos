

package dao;

import interfaces.InterfaceDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.TipoContatoModelo;

public class TipoContatoDao implements InterfaceDao {

    String sql; 
    PreparedStatement pStm; 
    ResultSet resultado; 
    
    @Override
    public void salvarDao(Object... obj) {
        TipoContatoModelo tcm = (TipoContatoModelo)obj[0]; 
        
        if (tcm.getId() == 0){
            sql  = "INSERT INTO tipo_contato (descricao) VALUES (?)";
        } else {
            sql  = "UPDATE tipo_contato SET descricao =? WHERE id_tipo_contato =?";
        }
        
        try {
            //preparando a conexão e manipulando os dados
            pStm = ConexaoBanco.abreConexao().prepareStatement(sql);
            
            pStm.setString(1, tcm.getDescricao());
            
            if (tcm.getId() > 0) pStm.setInt(2, tcm.getId()); 
            
            pStm.execute();
            
            pStm.close();
            
            JOptionPane.showMessageDialog(null, "Registro Gravado.");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Falha ao gravar o registro." + e);
        
        }
        
        
        
        
    }

    @Override
    public void excluirDao(int id) {
        sql = "DELETE FROM tipo_contato WHERE id_tipo_contato=?"; 
        
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
            sql = "SELECT * FROM tipo_contato";
        } else {
            sql = "SELECT * FROM tipo_contato WHERE descricao LIKE '%"+obj[0]+"%'";  // '%pesquisa%'
        }
        
        
        pStm = ConexaoBanco.abreConexao().prepareStatement(sql);
        resultado = pStm.executeQuery(); 
        
        while (resultado.next()) {
        
            tabela.addRow(
            
                    new Object[] {
                     resultado.getInt("id_tipo_contato"),
                     resultado.getString("descricao")
                    } 
            );
        }
        
        pStm.close(); 
        
    }

    @Override
    public void carregarComboBox(JComboBox itens) throws SQLException {
        
    }
    
}
