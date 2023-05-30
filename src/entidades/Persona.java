/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.  */
package entidades;

import java.util.ArrayList;

public class Persona {
    
    
    //Atriburos
    String nombre;
    ArrayList<Perro> perros;

    
    //Constructor
    public Persona() {
        this.perros = new ArrayList();
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
        this.perros = new ArrayList();
    }    

    public Persona(String nombre, ArrayList<Perro> perros) {
        this.nombre = nombre;
        this.perros = perros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    
    public void setUnPerro (Perro perro) {
        perros.add(perro);
    }    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", perros=" + perros + '}';
    }



    
}
