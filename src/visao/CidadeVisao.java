
package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class CidadeVisao extends FormPadrao {
    
    JLabel jlUf;
    JLabel jlCep;
    
    JComboBox jcbUf;
    
    JTextField jtfCep; 
    
    
    public CidadeVisao (){
        setTitle("Cadastro de Cidade"); 
    }

    @Override
    public void inicializarComponentes() {
        //componentes serão instânciados aqui
        //jlUf = new JLabel("UF");
        //jlUf.setBounds(10, 60, 50, 25);
        //jpnFormulario.add(jlUf); 
        
        //jcbUf = new JComboBox(); 
        //jcbUf.setBounds(9, 85, 70, 25);
        //jpnFormulario.add(jcbUf); 
        
        //jlCep = new JLabel("CEP");
        //jlCep.setBounds(90, 60, 100, 25);
        //jpnFormulario.add(jlCep); 
        
        //jtfCep = new JTextField(); 
        //jtfCep.setBounds(90, 85 , 100, 25);
        //jpnFormulario.add(jtfCep); 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salvarVisao() {
      
    }

    @Override
    public void criarTabela() {
        
         tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 710}, 
                new Object[] {"centro", "esquerda"}, 
                new Object [] {"ID", "Descricao"}
        );
    
    
        modelo = (DefaultTableModel) tabela.getModel();
        
        
        
    }

    @Override
    public void consultarVisao() {
        
    }

    @Override
    public void atualizarFormulario() {
        
    }

    @Override
    public void excluirVisao() {
        
    }
    
}
