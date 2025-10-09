/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_14_CAPTURA {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tama;
        System.out.println("Cuántas calificaciones va capturar? ");
        tama = captu.nextInt();
        int califas[] = new int[tama];
        //CAPTURAR
        for(int i = 0; i < califas.length; i++){
        System.out.println("Calificación" + (i + 1) + ":");
        califas[i] = captu.nextInt();   
        }
        //LEER
        for(int i = 0; i < califas.length; i++){
        System.out.println("[" + califas[i] + "]");
        //for --> posiciones del arreglo
        // length --> tamaño exacto del arreglo
    }
    
}
}