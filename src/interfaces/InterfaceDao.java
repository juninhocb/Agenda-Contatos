
package interfaces;

import java.sql.SQLException;
import javax.swing.JComboBox;


public interface InterfaceDao {
    
    public void salvarDao(Object... obj); 
    public void excluirDao(int id);
    public void consultarDao(Object... obj) throws SQLException;
    public void carregarComboBox(JComboBox itens) throws SQLException; 

}
