package actividad4;

import javax.swing.JOptionPane;

public class Actividad4 {

    public static void main(String[] args) {
        int[] ArrayNumeros = new int[10];
        String[] ArrayNotas = new String[10];
        
        
        for(int x=0;x<ArrayNumeros.length;x++){
            ArrayNumeros[x]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            ArrayNotas[x]=JOptionPane.showInputDialog("Introduce el nombre del alumno");
            if(0<ArrayNumeros[x] =< 4.99){
                JOptionPane.showMessageDialog(null, "Has suspendido");
                }
            else
                if(5=ArrayNumeros[x] =< 5.99){
                    }
                else
                    if(6=ArrayNumeros[x] =<6.99){
                        }
                    else
                    if(7=ArrayNumeros[x] =<8.99){
                        }
                    else
                    if(9=ArrayNumeros[x] =<10){
                        }
        }
    }
    
}
