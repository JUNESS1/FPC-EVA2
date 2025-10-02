/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int saldo = 5000;
        int pin, opc, monto, calculo;
        System.out.println("Introduce el PIN: ");
        pin = captu.nextInt();
        if(pin == 1234){
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar monto");
            System.out.println("3. Depositar monto");
            System.out.println("Selecciona la operacion");
            opc = captu.nextInt();
            if (opc == 1){
                System.out.println("Tu saldo es" + saldo);
            }else if (opc == 2){
                System.out.println("Cuanto vas a retirar? ");
                monto = captu.nextInt();
                if (monto <= saldo){
                    calculo = saldo - monto;
                 System.out.println("Tu saldo es " + calculo);
                }else{
                    System.out.println("Monto mayor al saldo!!");
                }
            }else if (opc == 3){
                System.out.println("Cuanto vas a depositar?");
                monto = captu.nextInt();
                if( monto>= 0){
                    calculo = saldo + monto;
                }
            } 
       
            
        }else{
            System.out.println("Pin incorrecto");
            
    }
    
}
}
