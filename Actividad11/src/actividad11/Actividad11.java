package actividad11;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class Actividad11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*no se como impedir que el usuario introduzca un dia que no este en un mes*/
        String año=JOptionPane.showInputDialog("Introduce el año que quieras(tiene que ser real)");
        String mes=JOptionPane.showInputDialog("Introduce el mes que quieras(tiene que ser real)");
        String dia=JOptionPane.showInputDialog("Introduce el dia que quieras(tiene que ser real)");
        
        
        Pattern patronAño = Pattern.compile("[0-2]?[0-9]?[0-9]?[0-9]");
        Matcher encajaAño = patronAño.matcher(año);
        if(encajaAño.matches()&& Integer.parseInt(año)>0 && Integer.parseInt(año)<=2019){
            
            Pattern patronDia = Pattern.compile("[0-3]?[0-9]?");
            Matcher encajaDia = patronDia.matcher(dia);
            
            if(encajaDia.matches()&& Integer.parseInt(dia)>0 &&Integer.parseInt(dia)<31){
                
                Pattern patronMes = Pattern.compile("[0-1]?[0-9]?");
                Matcher encajaMes = patronMes.matcher(mes);
                
                if(encajaMes.matches()&& Integer.parseInt(mes)>0 && Integer.parseInt(mes)<=12){
                    
                    JOptionPane.showMessageDialog(null,"Esta bine");
                }
            else
                JOptionPane.showMessageDialog(null,"El mes esta mal");
            }
            else
                JOptionPane.showMessageDialog(null,"El dia esta mal");
        }
        else
            JOptionPane.showMessageDialog(null,"El año esta mal");
    }
    
}
