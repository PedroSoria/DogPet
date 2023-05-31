package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosPersona {

    ArrayList<Persona> personas = new ArrayList();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearPersonasInicio() {
        personas.add(new Persona("Pedro"));
        personas.add(new Persona("Julian"));
        personas.add(new Persona("Sabrina"));
        personas.add(new Persona("Lucas"));
        personas.add(new Persona("Juan"));
        personas.add(new Persona("Gaston"));
    }

    
    
    public int cuentaPersonasSolas() {
        int j = 0;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getPerros().isEmpty()) {
                j++;
            }
        }
        return j;
    }

    public void personaSinMascota() {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getPerros().isEmpty()) {
                System.out.println(i + ". " + personas.get(i).getNombre());
            }
        }
    }

    public void personaConMascota() {
        for (int i = 0; i < personas.size(); i++) {
            if (!personas.get(i).getPerros().isEmpty()) {
                System.out.println(i + ". " + personas.get(i).getNombre() + " " + personas.get(i).getPerros());
            }
        }
    }

    public void adoptarMascota(ServiciosPerro sPerro) {
        String r;
        do {
            personaSinMascota();
            System.out.println("Seleccionar persona por id");
            int personaId = 0;

            sPerro.mascotasSinDueno();
            System.out.println("Seleccione un perro por id");
            int perroId = 0;
            
            Persona persona = personas.get(personaId);
            Perro perro = sPerro.perros.get(perroId);
            
            System.out.println(persona.toString());
            System.out.println(perro.toString());
            
            persona.setUnPerro(perro);
            perro.setDueno(persona);
            
            System.out.println(persona.toString());
            System.out.println(perro.toString());


            System.out.println("Desea adoptar otro perro para esta persona");
            r = sc.nextLine();
        } while (r.equalsIgnoreCase("s"));
    }
    
    
    public Persona traePersona(int n) {
        return personas.get(n);
    }

}
