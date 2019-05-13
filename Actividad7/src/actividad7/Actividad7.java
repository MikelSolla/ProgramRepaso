/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array creado
        ArrayList <String> lista= new ArrayList();
        
        //Elergir algo en el menu
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1-Agregar numero"
                                                                +"2-Ver numero"
                                                                +"3-Modificar numero"
                                                                +"4- Eliminar numero"
                                                                +"5-Insertar numero en cualquier posicion"));
        switch(opcion){
            case 1://Agregar numero
                String agregar = JOptionPane.showInputDialog("Introduce el numero que quieras añadir");
                lista.add(agregar);
                break;
            case 2://Ver numero
                int buscar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieras ver"));
                for(int x= 0;x<lista.size();x++)
                    if(lista.contains(buscar))
                        JOptionPane.showMessageDialog(null, "El numero "+buscar +" esta en la posicion "+x);
                    else
                        JOptionPane.showMessageDialog(null, "No esta en la posicion "+x);
             break;
            case 3://Modificar numero
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres cambiar"));
                lista.remove(posicion);
                lista.set(posicion, JOptionPane.showInputDialog("NUmero que quieres introducir"));
                break;
            case 4://Eliminar numero
                int eliminar = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres cambiar"));
                lista.remove(eliminar);
                break;
            case 5://Insertar numero en cualquier posicion
                
                break;
        
    }
        }
     
    }
    

