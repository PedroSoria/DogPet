/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona. 

Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros. */
package personaperro;

//import entidades.Menu;

import entidades.Menu;
import entidades.Perro;
import entidades.Persona;
import servicios.ServiciosPerro;
import servicios.ServiciosPersona;



public class PersonaPerro {

    public static void main(String[] args) {

    Menu menu = new Menu();
    menu.Menu();
        
        
        
//        ServiciosPersona serviciosPersona = new ServiciosPersona();
//        ServiciosPerro serviciosPerro = new ServiciosPerro();
//        
//        serviciosPersona.crearPersonasInicio();
//        serviciosPerro.creaPerrosInicio();
//        
//        //System.out.println("Seleccionar persona por id");
//        int personaId = 0;
//
//        //System.out.println("Seleccione un perro por id");
//        int perroId = 0;
//        
//        System.out.println("Personas solas: " + serviciosPersona.cuentaPersonasSolas());
//        System.out.println("Perros solos: " + serviciosPerro.cuentaPerrosSolos());
//
//        Persona persona = serviciosPersona.traePersona(personaId);
//        Perro perro = serviciosPerro.traePerro(perroId);
// 
//        //imprime todas las pesonas que no tiene mascota
//        System.out.println("imprime todas las pesonas que no tiene mascota");
//        serviciosPersona.personaSinMascota();
//        System.out.println("");
//
//        //imprime todas las mascotas sin dueno
//        System.out.println("imprime todas las mascotas sin dueno");
//        serviciosPerro.mascotasSinDueno();
//        System.out.println("");
//        
//        //adopta mascota
//        persona.setUnPerro(perro);
//        perro.setDueno(persona);
//
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
// 
//        System.out.println("persona.toString");
//        System.out.println(persona.toString());
//        System.out.println("");
//        
//        System.out.println("perro.toString");
//        System.out.println(perro.toString());
//        System.out.println("");
//  
//        System.out.println("imprime todas las pesonas que si tiene mascota");
//        serviciosPersona.personaConMascota();
//        System.out.println("");
//        
//        System.out.println("imprime todas las personas sin mascota");
//        serviciosPersona.personaSinMascota();
//        System.out.println("");
//
//        System.out.println("imprime todas las mascotas sin dueno");
//        serviciosPerro.mascotasSinDueno();
//        System.out.println("");
//        
//        System.out.println("mascota con dueno");
//        serviciosPerro.mascotasConDueno();
//        System.out.println("");
//        
//        System.out.println("Personas solas: " + serviciosPersona.cuentaPersonasSolas());
//        System.out.println("Perros solos: " + serviciosPerro.cuentaPerrosSolos());
// 
    }
}
