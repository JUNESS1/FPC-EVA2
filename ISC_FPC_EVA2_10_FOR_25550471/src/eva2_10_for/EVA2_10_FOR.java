/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //IMPRIMIR LOS NUMEROS DEL 1 - 20:
        // 1 - 2 - 3 - 4 - 5 - 6 ... 20
        System.out.println(""); 
        for(int i = 1; i <= 20; i ++)
            System.out.print(i + " - ");
        
        // IMPRIMIR NUMEROS PARES DE 0 A 100
        // 0 - 2 - 4 - 6 ... 100
        // += SUMA, -= RESTA, *= MULTIPLICA, /= DIVIDE
        System.out.println(""); 
        for(int i = 0; i <= 100; i += 2)
            System.out.print(i + " - ");
        
        //repitan el anterior, en orden inverso
        System.out.println(""); 
        for(int i = 100; i >= 0; i -= 2)
            System.out.print(i + " - "); //PARES DEL 100 A 0
        
        // imprimir la lista de numeros entre cualquier valor 
        // que el usuario quiera 
        // EJEMPLO: -15 y 5 --> -15 - 14 -13 ... 0 1 2 3 4 5
        //IMPRIMAN EN ORDEN INVERSO 
        System.out.println("");
        Scanner captu = new Scanner(System.in);
        int numI, numF;
        System.out.println("Ingresa el numero inicial: ");
        numI = captu.nextInt();
        System.out.println("Ingresa el numero con el que quiere finalizar: ");
        numF = captu.nextInt();
        
        for(int i = numI ; i <= numF; i++){
            System.out.println(i);
        
        }
        
        //IMPRIMIR EN LA TABLA DE MULTIPLICAR (1 A 10) DE 
        // CUALQUIER NUMERO QUE DE EL USUARIO
        System.out.println("");
        
        int num;
        System.out.println("Ingresa un numro para generar una tabla de multiplicar (1 a 10): ");
        num = captu.nextInt();
        System.out.println("Tabla de multiplicar del " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        
        }
        
    }
    

