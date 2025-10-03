/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string_2;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_6_ARREGLOS_STRING_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int dia;
        String diasSemana[] = {"Domingo", "Lunes", "Martes", "Miércoles","Jueves","Viernes","Sbado"};
        //En el orden en que tú los pones así va salir en el código
        
        System.out.println("Introduce el día en numero (0 - 6)");
        dia = captu.nextInt();
        System.out.println("El día es " + diasSemana[dia]);
        String diaTexto = diasSemana[dia];
        System.out.println(diaTexto);
    }
    
}
