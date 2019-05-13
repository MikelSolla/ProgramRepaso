/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array creado
        ArrayList<String> palabra=new ArrayList();
        
        //Palabra pedida
        String texto=JOptionPane.showInputDialog("Introduce un texto para ponerlo del reves");
        String textoInvertido="";

        //Poner del reves la palabra
        for (int x=texto.length()-1;x>=0;x--)
		textoInvertido =  textoInvertido + texto.charAt(x);
                       
        //Palabra metida dentro del Array
        palabra.add(texto);
        
        //Mostrar palabra
        System.out.println(textoInvertido);
    }
    
}
