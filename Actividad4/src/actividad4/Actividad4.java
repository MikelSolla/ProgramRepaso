package actividad4;

import javax.swing.JOptionPane;

public class Actividad4 {

    public static void main(String[] args) {
        int[] ArrayNumeros = new int[10];
        String[] ArrayNotas = new String[10];
        
        
        for(int x=0;x<ArrayNumeros.length;x++){
            ArrayNumeros[x]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del alumno"));
            ArrayNotas[x]=JOptionPane.showInputDialog("Introduce el nombre del alumno");
            if(0<ArrayNumeros[x]&& ArrayNumeros[x] <= 4.99)
                JOptionPane.showMessageDialog(null, "Suspenso");
            else
                if(5<ArrayNumeros[x]&& ArrayNumeros[x] <= 5.99){
                    JOptionPane.showMessageDialog(null, "Suficiente");
                }
                else
                    if(6<ArrayNumeros[x] && ArrayNumeros[x] <=6.99){
                        JOptionPane.showMessageDialog(null, "Bien");
                    }
                    else
                    if(7<ArrayNumeros[x] && ArrayNumeros[x] <=8.99){
                        JOptionPane.showMessageDialog(null, "Notable");
                        }   
                    else
                    if(9<ArrayNumeros[x] && ArrayNumeros[x] <=10){
                        JOptionPane.showMessageDialog(null, "Soblesaliente");
                    }
            for(int x = 0; x < ListaNumeros.length; x++)
            JOptionPane.showMessageDialog(null,"Posicion:"+ (x+1) +"Contenido: " + ListaNumeros[x]);
                    }
        }
    }
    

