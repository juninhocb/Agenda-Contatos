
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexaoBanco {
    
    private static final String DRIVERCLASS = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/agendacontatos";
    private static final String USERNAME = "root"; 
    private static final String PASSWORD = "p@lmeiras2";
    
    
    public static Connection abreConexao() {
        
        Connection  conn = null; 
        
        try {
            Class.forName(DRIVERCLASS);
            //url, root e password
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de daods: " +  e);
        }
        
        
        
        return conn; 
    }
    
}
