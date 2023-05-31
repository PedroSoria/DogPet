package entidades;

import java.util.Scanner;
import servicios.ServiciosPerro;
import servicios.ServiciosPersona;

public class Menu {
    
    ServiciosPersona sPersona = new ServiciosPersona();
    ServiciosPerro sPerro = new ServiciosPerro();

    public void Menu() {


        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        sPersona.crearPersonasInicio();
        sPerro.creaPerrosInicio();

        System.out.println("Sistema de adopcion de mascotas por personas (S.A.M.P)");
        System.out.println("Usted tiene " + sPerro.cuentaPerrosSolos() + " mascotas sin dueño y existen " + sPersona.cuentaPersonasSolas() + " interesados ¿que descea hacer?");
        System.out.println("");
        System.out.println("    1. Adoptar Mascotas");
        System.out.println("    2. Ver Mascotas sin dueño");
        System.out.println("    3. Ver Mascotas con dueño");
        System.out.println("    4. Ver Personas Sin mascotas");
        System.out.println("    5. Ver personas con mascotas");
        System.out.println("    6. Desadoptar Mascota");
        System.out.println("    7. Matar Mascota");
        System.out.println("    8. Matar Persona");
        System.out.println("    9. Tratar de resucitar Persona");
        System.out.println("    10. Tratar de resucitar Perro");
        System.out.println("    11. Salir");

        int r = sc.nextInt();

        switch (r) {
            case 1:
                sPersona.adoptarMascota(sPerro);
                Menu();
                break;
            case 2:
                sPerro.mascotasSinDueno();
                Menu();
                break;
            case 3:
                sPerro.mascotasConDueno();
                Menu();
                break;
            case 4:
                sPersona.personaSinMascota();
                Menu();
                break;
            case 5:
                sPersona.personaConMascota();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                System.out.println("Por favor ingresar un numero dentro del menu");
                Menu();
        }

    }
}
