package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;

public class ServiciosPerro {

    ArrayList<Perro> perros = new ArrayList();

    public void creaPerrosInicio() {
        
        Persona persona = new Persona();
        
        perros.add(new Perro("Pepito", persona));
        perros.add(new Perro("Lupin", persona));
        perros.add(new Perro("Tintin", persona));
        perros.add(new Perro("Tonton", persona));
        perros.add(new Perro("Rintinti", persona));
        perros.add(new Perro("Giligan", persona));
        perros.add(new Perro("Chapi", persona));
        perros.add(new Perro("Guzman", persona));
        perros.add(new Perro("Loco", persona));
    }

    public int cuentaPerrosSolos() {
        int j = 0;

        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getDueno() == null) {
                j++;
            }
        }
        return j;
    }

    public void mascotasSinDueno() {

    }

    public void mascotasConDueno() {

    }
    
    
    public Perro traePerro(int n) {
        return perros.get(n);
    }

}
