package actividad14;

import Exception.*;
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
    public static void main(String[] args) throws Exception {
        
        
        ArrayList<Persona>lista=new ArrayList();
         do{
            String dni = JOptionPane.showInputDialog("Teclea el DNI");
            validarDNI(dni);
            String nombre = JOptionPane.showInputDialog("Teclea el nombre");
            validarNombreApellido(nombre);
            String apellido = JOptionPane.showInputDialog("Teclea el apellido");
            validarNombreApellido(apellido);
            String sexo = JOptionPane.showInputDialog("Teclea el sexo(H/M)");
            validarSexo(sexo);
            String edad = JOptionPane.showInputDialog("Teclea la edad");
            validarEdad(edad);
            String peso = JOptionPane.showInputDialog("Teclea el peso");
            validarPeso(peso);
                 
            Persona p= new Persona(dni,nombre,apellido,sexo,edad,peso);
                 
            lista.add(p);   
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar?")==0);
        int menu;
        int y;
        do{
        menu =Integer.parseInt(JOptionPane.showInputDialog("Elige que quieres hacer:1Buscar/2Eliminar/3Ordenar/4Todos/5Salir"));
        switch(menu){
            case 1:
                String dni =JOptionPane.showInputDialog("Introduce el DNI que quieres buscar");
                int x;
                for(x = 0; x < lista.size() && lista.get(x).getDNI().equals(dni)== false; x++)
                if( x == lista.size())
                    JOptionPane.showMessageDialog(null,"Persona con ese DNI no encontrada");
                else
                    JOptionPane.showMessageDialog(null,"Objeto persona: " + lista.get(x) + "\n" + lista.get(x).toString());
                break;
                
            case 2:
                String nombre =JOptionPane.showInputDialog("Introduce la persona que quieres borrar");
                
                for(y = 0; y < lista.size() && lista.get(y).getNombre().equals(nombre)== false; y++)
                if( y == lista.size())
                    JOptionPane.showMessageDialog(null,nombre+" no encontrado/a");
                else
                    lista.get(y).setApellido(null);
                    lista.get(y).setDNI(null);
                    lista.get(y).setNombre(null);
                    lista.get(y).setPeso(null);
                    lista.get(y).setSexo(null);
                    lista.get(y).setEdad(null);
                    JOptionPane.showMessageDialog(null, nombre+" ha sido borrado");
                break;
            case 3:
                /*no se como hacerlo*/
                break;
            case 4:
                
                break;
            case 5:
                System.exit(0);
                break;
        }
        }
        while(menu !=5);
        
     
    }
    public static void validarNombreApellido(String nombre)throws Exception{
        
        boolean error=false;
        if (nombre.length()<= 2)
            error = true;
        else
            // Todo letras
            for (int x = 0; x < nombre.length() && error == false;x++)
                if (Character.isDigit(nombre.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();
                    
    }
    public static void validarSexo(String sexo)throws Exception{
        boolean error = false;
        if(!"H".equals(sexo) && !"M".equals(sexo))
            error =true;
        if (error)
            throw new DatoNoValido();
    }
    public static void validarEdad(String edad)throws Exception{
        boolean error = false;
        if(Integer.parseInt(edad)<0 || Integer.parseInt(edad)>150)
            error=true;
        if (error)
            throw new DatoNoValido();
    }
    public static void validarPeso(String peso)throws Exception{
        boolean error = false;
        if(Integer.parseInt(peso)<35 || Integer.parseInt(peso)>150)
            error=true;
        
        if (error)
            throw new DatoNoValido();
    }
    public static void validarDNI(String dni)throws Exception{
        boolean error=false;
        if (dni.length()== 9)
            error = true;
    }
 }
    

