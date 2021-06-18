/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Legnus
 */
public class LimitadorNumeros extends PlainDocument {
     private int qtdMax;
    
    public LimitadorNumeros(int max){
        
        if (max<=0){
            throw new IllegalArgumentException("Erro ao definir quantidade de caracteres máximos");
        
        }else{
            this.qtdMax = max;
        }
    }
    
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        
        if(str == null || getLength() == qtdMax){
            return;
        }
       
        int totalQuantidade = (getLength()+str.length());
         
        if(totalQuantidade<=qtdMax){
            super.insertString(offs, str.replaceAll("[^0-9^/^.^]", ""), a); //To change body of generated methods, choose Tools | Templates.
            return;
        }
        String nova = str.substring(0,getLength() - qtdMax);
        super.insertString(offs, nova, a);
        
    }
    
}

