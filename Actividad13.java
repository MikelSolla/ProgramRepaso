/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Actividad13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*me sale siempre el mensaje "direccion mal escrita"*/
        String calle = JOptionPane.showInputDialog("Introduce la calle en la que vives(calle, numero, piso, letra(Mayus.), ciudad, codigo postal)");
        Pattern patron = Pattern.compile("^calle [A-Z]*[a-z]+ [A-Z]*[a-z]* [A-Z]*[a-z]* [A-Z]*[a-z]* ,[0-9]{1,100},[0-9]{1,20},[A-J],[A-Z]*[a-z]+,[0-9]{5}");
        Matcher encaja = patron.matcher(calle);
        if(encaja.matches())
            JOptionPane.showMessageDialog(null, "Direccion guardada");
        else 
            JOptionPane.showMessageDialog(null, "Direccion mal escrita");
    }
    
}
