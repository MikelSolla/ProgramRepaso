package actividad14;

import java.util.ArrayList;
import Clases.Persona;
import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw08
 */
public class Actividad14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Persona> persona;
        persona = new ArrayList();
        
        String dni = JOptionPane.showInputDialog("Introduce el DNI");
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        String apellido = JOptionPane.showInputDialog("Introduce el apellido");
        String sexo = JOptionPane.showInputDialog("Introduce el sexo");
        String edad = JOptionPane.showInputDialog("Introduce el edad");
        String peso = JOptionPane.showInputDialog("Introduce el peso");
        
        
        
    }
    
}
