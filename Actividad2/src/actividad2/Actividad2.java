package actividad2;

import javax.swing.JOptionPane;

public class Actividad2 {

    public static void main(String[] args) {
        int[]ListaNumeros;
        int tamaño;
        String finaliza;
        tamaño=Integer.parseInt(JOptionPane.showInputDialog("De que tamaño quieres que sea el Array?"));
        ListaNumeros=new int[tamaño];
        
        for(int x = 0; x < ListaNumeros.length; x++) 
        ListaNumeros[x] = (int) (Math.random()*300+1);
        //JOptionPane.showMessageDialog(null,"Posicion:"+ (x+1) +"Contenido: " + ListaNumeros[x]);
        
        finaliza=JOptionPane.showInputDialog("Como quieres que terminen los numeros?");
        
        for(int x = 0; x < ListaNumeros.length; x++)
            if(ListaNumeros[x].charAt(ListaNumeros[x].length-1)){
                
            }
            
    }
    
}
