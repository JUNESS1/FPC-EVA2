/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue;

/**
 *
 * @author equipo
 */
public class EVA2_22_CONTINUE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // imprimir numeros pares 
        int i = 0;
        while(i < 100){
            int resi = i % 2;
            if(resi != 0){//NO ES divisibles entre 2
                i++;
                continue;//interrumpe la repeticion actual
        }
            System.out.print(i + "-"); 
        i++;
        }
    }
}

    

