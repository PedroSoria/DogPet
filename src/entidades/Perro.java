/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.  */
package entidades;

import java.util.ArrayList;

public class Perro {

    //Atributos
    String nombre;
    ArrayList<Persona> dueno;

    //Constructor
    public Perro() {
        this.dueno = new ArrayList();
    }
    
    public Perro(String nombre) {
        this.nombre = nombre;
        this.dueno = new ArrayList();
    }

    public Perro(String nombre, ArrayList<Persona> dueno) {
        this.nombre = nombre;
        this.dueno = dueno;
    }

    


    //Getter Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getDueno() {
        return dueno;
    }

    public void setDueno(ArrayList<Persona> dueno) {
        this.dueno = dueno;
    }

    public void setUnDueno(Persona dueno) {
        this.dueno.add(dueno);
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", dueno=" + dueno.get(0).getNombre() + '}';
    }

  
}
