/*
 * Limitador de TextField para letras
 */
package modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Bruno Espindola de Brito
 */
public class LimitadorLetras extends PlainDocument {
    private int qtdMax;
    
    public LimitadorLetras(int max){
        
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
            super.insertString(offs, str.replaceAll("[^a-z^A-Z^' ']", ""), a); //To change body of generated methods, choose Tools | Templates.
            return;
        }
        String nova = str.substring(0,getLength() - qtdMax);
        super.insertString(offs, nova, a);
        
    }
    
}
