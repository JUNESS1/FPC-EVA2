/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_switch;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opc;
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar monto");
        System.out.println("3. Depositar monto");
        System.out.println("Selecciona una opcion del menu");
        opc = captu.nextInt();
        switch(opc){
            case 1:
                System.out.println("Elejiste imprimir saldo!!");
                break;//rompe o detiene la instruccion
            case 2:
                System.out.println("Elegiste retirar saldo!!");
                break;//fin del switch
            case 3:
                System.out.println("Elegiste depositar!!");
                break;//fin del switch
            default: //OPCIONAL
                System.out.println("Opcion incorrecta!!");
                
        }
    }
    
}
