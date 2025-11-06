/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_29_CONTRA_FOR {
    
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);
       String usu, contra;       
       boolean acceso = false;//banderas     
       
        for(int intento = 1; intento <= 4; intento++){
            System.out.println("Intento " + intento);
            System.out.println("Usuario:");
            usu = captu.nextLine();
            System.out.println("Contraseña:");
            contra = captu.nextLine();          
           
        if (usu.equals(USUARIO) && contra.equals(PWD)) {
                acceso = true;
                System.out.println("ACCESO CONCEDIDO.");
                break;
                
            } else {
                System.out.println("INCORRECTO.");
            }
        }

        if (!acceso) {
            System.out.println("ACCESO DENEGADO. Se agotaron los intentos.");

      }  
    }
}
    

