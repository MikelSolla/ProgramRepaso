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
        

        String dni = JOptionPane.showInputDialog("Introduce el DNI");
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        String apellido = JOptionPane.showInputDialog("Introduce el apellido");
        String sexo = JOptionPane.showInputDialog("Introduce el sexo");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce el edad"));
        int peso = Integer.parseInt(JOptionPane.showInputDialog("Introduce el peso"));
        
        p = new Persona(dni,nombre,apellido,sexo,edad,peso);
                dni.add(p);
        
        int menu =Integer.parseInt(JOptionPane.showInputDialog("Elige que quieres hacer:1Buscar/2Eliminar/3Ordenar/4Todos"));
        
        switch(menu){
            case 1:
                JOptionPane.showInputDialog("Introduce el DNI que quieres buscar");
                break;
            case 2:
                JOptionPane.showInputDialog("Introduce la persona que quieres borrar");
                break;
            case 3:
                /*Ordenar por apellido*/
                break;
            case 4:
                /*Mostrar todas las personas*/
                break;
        }
        
        
        
    }
        
        
    }
    

