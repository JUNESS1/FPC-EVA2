/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author equipo
 */
public class EVA2_28_PRIMO {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        //Solicitar al usuario un valor
        System.out.print("Ingresa un numero: ");
        num = captu.nextInt();
        boolean primo = true;//se usa para preguntas de si o no
        //determina si es falso
        for(int i = 2; i < num; i ++){
            //dividir (exacta)
            int residuo = num % i;
            if (residuo == 0){//YA NO ES PRIIMO
                primo = false;//una division exacta y ya no es primo
                break;
            }
        
        }
                 
        if (primo) {
            System.out.println(num + " Es un numero primo.");
        } else {
            System.out.println(num + " No es primo.");
        }

        
    }
}
