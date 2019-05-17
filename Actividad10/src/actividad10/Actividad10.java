/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Actividad10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String datoEntrada = JOptionPane.showInputDialog("Introduce un email(xxxx@gmail.com o xxxx@hotmail.com)");
        Pattern email = Pattern.compile("[a-z0-9]{5,15}(@gmail.com|@hotmail.com)");
        Matcher encaja = email.matcher(datoEntrada);
        if(!encaja.matches())
            JOptionPane.showMessageDialog(null, "email no valido, vuelve a intentarlo");
        else 
            JOptionPane.showInternalMessageDialog(null, "Has iniciado el correo correctamente");
            
        
        
        
        
    }
    
}
