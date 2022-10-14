package controle;

import dao.TipoContatoDao;
import interfaces.InterfaceControle;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.TipoContatoModelo;


public class TipoContatoControle implements InterfaceControle {

    TipoContatoModelo tcm = new TipoContatoModelo();
    TipoContatoDao tcd = new TipoContatoDao();
    
    @Override
    public void salvarControle(Object... obj) {
       
       if ("".equals(obj[0])){
            tcm.setId(0); 
        } else {
            tcm.setId(Integer.parseInt(obj[0].toString()));
        }
      
       tcm.setDescricao((String) obj[1]);
       
       //enviar as informações para o DAO
       tcd.salvarDao(tcm);
       
    }

    @Override
    public void excluirControle(int id) {
        tcd.excluirDao(id);
    }

    @Override
    public void carregarComboBox() {
        
    }

    @Override
    public void consultarControle(Object... obj) {
        
        try {
            tcd.consultarDao(obj);
        } catch (SQLException e) {
            Logger.getLogger(TipoContatoControle.class.getName()).log(Level.SEVERE, null, e); 
        }
        
        
    }

    
    
}
