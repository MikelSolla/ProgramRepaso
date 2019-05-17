package Clases;

public class Persona {
    String DNI;
    String nombre;
    String apellido;
    int sexo;
    int edad;
    int peso;

    public Persona(String DNI, String nombre, String apellido, int sexo, int edad, int peso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
