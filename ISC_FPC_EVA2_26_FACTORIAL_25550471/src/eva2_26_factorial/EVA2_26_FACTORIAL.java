/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_26_FACTORIAL {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        //Solicitar al usuario un número
        System.out.print("Ingresa un numero: ");
        valor = captu.nextInt();
        //calcula la factorial
        long factorial = 1;
        for(int i = 1; i <= valor; i++){
            factorial *= i;
        }
        //imprime el resultado
        System.out.println("El factorial de " + valor + " es " + factorial);
        captu.close();
    }
    
}
