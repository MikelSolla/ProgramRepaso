/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class Actividad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] ListaNumeros = new int[10];

        for(int x = 0; x < ListaNumeros.length; x++){
        ListaNumeros[x] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero en la posicion "+(x+1)));
        }
        int numero = Integer.parseInt(JOptionPane.showInputDialog("1-Mostrar el contenido de todas las posiciones"
        +"2-Mostrar el contenido de una posicion"
        +"3-Modificar el contenido de una posicion concreta"
        +"4- Vaciar el contenido de una posicion concreta"
        +"5-culcular la suma y la media de todos los numeros"
        +"6-Ordena los numeros de mayor a menor"));
        switch(numero){
            
        case 1:
            for(int x = 0; x < ListaNumeros.length; x++)
            JOptionPane.showMessageDialog(null,"Posicion:"+ (x+1) +"Contenido: " + ListaNumeros[x]);
            break;
        case 2:
            int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres ver"));
            
                JOptionPane.showMessageDialog(null,"Posicion:"+ posicion +"Contenido: "+ListaNumeros[posicion]);
            break;
        case 3:
            int modificar=Integer.parseInt(JOptionPane.showInputDialog("¿Que posicion quieres cambiar?"));
            for(int x = 0; x < modificar; x++)
                ListaNumeros[modificar]=Integer.parseInt(JOptionPane.showInputDialog("Vas a cambiar el numero "+ListaNumeros[modificar]+" por..."));
            
            for(int x = 0; x < ListaNumeros.length; x++)    
                JOptionPane.showMessageDialog(null,"Contenido: " + ListaNumeros[x]);
            break;
        case 4:
            int borrar=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres borrar"));
            for(int x = 0; x < borrar; x++)
                ListaNumeros[borrar]=0;
            for(int x = 0; x < ListaNumeros.length; x++)    
                JOptionPane.showMessageDialog(null,"Contenido: " + ListaNumeros[x]);
            break;
        case 5:
             int suma =0;

     for(int x = 0; x < ListaNumeros.length; x++)
           suma=suma +ListaNumeros[x];
           JOptionPane.showMessageDialog(null, 
           "La suma de todos los numeros de la lista es: "+suma);
           JOptionPane.showMessageDialog(null, 
           "La media de todos los numeros de la lista es: "+suma/ListaNumeros.length);

            break;
        case 6:   
            Arrays.sort(ListaNumeros);
            for(int x = 10; x > ListaNumeros.length; x--)
            JOptionPane.showMessageDialog(null,"Posicion:"+ (x) +"Contenido: " + ListaNumeros[x]);
            break;
    }
    
    }
}
