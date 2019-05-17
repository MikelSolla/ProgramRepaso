/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class Actividad12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datoEntrada = JOptionPane.showInputDialog("Introduce tu nombre");
        Pattern nombre = Pattern.compile("[A-Z][a-z]+");
        Matcher encaja = nombre.matcher(datoEntrada);
        if(encaja.matches())
            JOptionPane.showInternalMessageDialog(null, "Hola, "+datoEntrada);
        else
            JOptionPane.showMessageDialog(null, "El nombre esta mal introducido");
    }
    
}
