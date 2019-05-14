/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class Actividad9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String digitos = JOptionPane.showInputDialog("Introduce los digitos de un DNI");
        Pattern dni = Pattern.compile("[0-9]{8}");
        Matcher encaja = dni.matcher(digitos);
        if(encaja.matches())
            JOptionPane.showMessageDialog(null, digitos);
            
        else
            JOptionPane.showMessageDialog(null, "DNI no valido, vuelve a intentarlo");
        
        
        int division = Integer.parseInt(digitos);
        
        do{
        division = division%23;
                }
        while((division/23)>0);
        JOptionPane.showMessageDialog(null,division);
        int DNICompleto;
        switch(division){
            case 0:
                JOptionPane.showMessageDialog(null,digitos+"-T");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,digitos+"-R");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,digitos+"-W");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,digitos+"-A");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,digitos+"-G");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,digitos+"-M");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,digitos+"-Y");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,digitos+"-F");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,digitos+"-P");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,digitos+"-D");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,digitos+"-X");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,digitos+"-B");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,digitos+"-N");
                break;
            case 13:
                JOptionPane.showMessageDialog(null,digitos+"-J");
                break;
            case 14:
                JOptionPane.showMessageDialog(null,digitos+"-Z");
                break;
            case 15:
                JOptionPane.showMessageDialog(null,digitos+"-S");
                break;
            case 16:
                JOptionPane.showMessageDialog(null,digitos+"-Q");
                break;
            case 17:
                JOptionPane.showMessageDialog(null,digitos+"-V");
                break;
            case 18:
                JOptionPane.showMessageDialog(null,digitos+"-H");
                break;
            case 19:
                JOptionPane.showMessageDialog(null,digitos+"-L");
                break;
            case 20:
                JOptionPane.showMessageDialog(null,digitos+"-C");
                break;
            case 21:
                JOptionPane.showMessageDialog(null,digitos+"-K");
                break;
            case 22:
                JOptionPane.showMessageDialog(null,digitos+"-E");
                break;
            
        }
    
}
}
