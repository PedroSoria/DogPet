/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.  */
package entidades;

public class Perro {

    //Atributos
    String nombre;
    Persona dueno;

    //Constructor
    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
        //this.dueno = null;
    }

    public Perro(String nombre, Persona dueno) {
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

    public Persona getDueno() {
        return dueno;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", dueno=" + dueno + '}';
    }



  
    
    

}
