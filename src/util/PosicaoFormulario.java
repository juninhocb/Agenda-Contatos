/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author Usuario
 */
public class PosicaoFormulario {
    
    
    public void abrirFormulario(JInternalFrame janela, JDesktopPane desktop){
    
        int lDesk = desktop.getWidth(); 
        int aDesk = desktop.getHeight();
        int lFrame = janela.getWidth();
        int aFrame = janela.getHeight();
        janela.setLocation (lDesk/ 2 - lFrame / 2, aDesk / 2 - aFrame / 2); 
        desktop.add(janela); 
        janela.setVisible(true); 
        
    }
    
}
