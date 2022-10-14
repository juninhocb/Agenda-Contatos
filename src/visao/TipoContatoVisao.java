
package visao;

import controle.TipoContatoControle;
import javax.swing.table.DefaultTableModel;


public class TipoContatoVisao extends FormPadrao{

    public TipoContatoVisao(){
        setTitle("Cadastro de tipos de contato"); 
        consultarVisao();
    }
    
    @Override
    public void inicializarComponentes() {
        //Metodos serão implementados aqui
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    TipoContatoControle tcc = new TipoContatoControle(); 

    @Override
    public void salvarVisao() {
        tcc.salvarControle(jtfId.getText(), jtfDescricao.getText());
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
        modelo.setNumRows(0); 
        tcc.consultarControle(jtfConsulta.getText(), modelo);
    }

    @Override
    public void atualizarFormulario() {
        
        jtfId.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        jtfDescricao.setText((String) tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        
    }

    @Override
    public void excluirVisao() {
        tcc.excluirControle(Integer.parseInt(jtfId.getText()));
    }
    
    
}
