package servicios;

import entidades.Perro;
import java.util.ArrayList;

public class ServiciosPerro {

    ArrayList<Perro> perros = new ArrayList();

    public void creaPerrosInicio() {
  
        perros.add(new Perro("Pepito"));
        perros.add(new Perro("Lupin"));
        perros.add(new Perro("Tintin"));
        perros.add(new Perro("Tonton"));
        perros.add(new Perro("Rintinti"));
        perros.add(new Perro("Giligan"));
        perros.add(new Perro("Chapi"));
        perros.add(new Perro("Guzman"));
        perros.add(new Perro("Loco"));
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
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getDueno() == null) {
                System.out.println(i + ". " + perros.get(i).getNombre());
            }
        }
    }

    public void mascotasConDueno() {
        for (int i = 0; i < perros.size(); i++) {
            if (perros.get(i).getDueno() != null) {
                System.out.println(i + ". " + perros.get(i).getNombre() + " Dueño: " + perros.get(i).getNombre());
            }
        }
    }
    
    public Perro traePerro(int n) {
        return perros.get(n);
    }
    
    
    public void desadoptarDueno(int n) {
        perros.get(n).setDueno(null);
    }
    
    public void resucitarPersona() {
        
    }

}
