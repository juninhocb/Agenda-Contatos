/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.BairroDao;
import interfaces.InterfaceControle;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.BairroModelo;

/**
 *
 * @author Usuario
 */
public class BairroControle implements InterfaceControle  {

    
    BairroModelo bm = new BairroModelo(); 
    BairroDao bdao = new BairroDao();
    
    @Override
    public void salvarControle(Object... obj) {
       if ("".equals(obj[0])){
            bm.setId(0); 
        } else {
            bm.setId(Integer.parseInt(obj[0].toString()));
        }
      
       bm.setDescricao((String) obj[2]);
       bm.setNome((String) obj[1]);
       //enviar as informações para o DAO
       bdao.salvarDao(bm); 
       
    }

    @Override
    public void excluirControle(int id) {
       bdao.excluirDao(id);
    }

    @Override
    public void consultarControle(Object... obj) {
        try {
            bdao.consultarDao(obj);
        } catch (SQLException e) {
            Logger.getLogger(TipoContatoControle.class.getName()).log(Level.SEVERE, null, e); 
        }
    }

    @Override
    public void carregarComboBox() {
        //TODO 
        //chamar o DAO para carregar o combobox 
    }
    
}
