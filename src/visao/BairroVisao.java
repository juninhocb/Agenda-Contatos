
package visao;

import controle.BairroControle;
import controle.TipoContatoControle;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class BairroVisao extends FormPadrao {
    
    JLabel jlBairro; 
    JComboBox jcbBairro; 
    
     BairroControle bcontrol = new BairroControle(); 
    
    
    public BairroVisao (){
        setTitle("Cadastro de Bairros"); 
        consultarVisao();
        //bcontrol.carregarComboBox();
    }
    
    @Override
    public void inicializarComponentes() {
        //jlBairro = new JLabel("Bairro");
        //jlBairro.setBounds(10, 60, 50, 25);
        //jpnFormulario.add(jlBairro); 
        
        //jcbBairro = new JComboBox(); 
        //jcbBairro.setBounds(9, 85, 250, 25);
        //jpnFormulario.add(jcbBairro); 
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    @Override
    public void salvarVisao() {
        bcontrol.salvarControle(
                jtfId.getText(),
                jtfDescricao.getText(),
                jtfDescricao.getText()
        );
    }

    @Override
    public void criarTabela() {
        tabela = utilTabela.criarTabela(
                jpnConsulta, 
                new Object[] {60, 710}, 
                new Object[] {"centro", "esquerda"}, 
                new Object [] {"ID", "Bairro"}
        );
    
    
        modelo = (DefaultTableModel) tabela.getModel();
    }

    @Override
    public void consultarVisao() {
        modelo.setNumRows(0);
       
        bcontrol.consultarControle(jtfConsulta.getText(), modelo);
        
        
    }

    @Override
    public void atualizarFormulario() {
        jtfId.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        jtfDescricao.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
    }

    @Override
    public void excluirVisao() {
        
        bcontrol.excluirControle(Integer.parseInt(jtfId.getText()));
        
    }
    
}
