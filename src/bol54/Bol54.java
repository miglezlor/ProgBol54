
package bol54;

import java.util.Scanner;

/**
 *
 * @author mgonzalezlorenzo
 */
public class Bol54 {


    public static void main(String[] args) {

        int polbo, patacas, clientes;
        
        Scanner obx=new Scanner (System.in);
        System.out.println("Introduce os kilos de polbo disponibles: ");
        polbo=obx.nextInt();
        System.out.println("Introduce os kilos de patacas disponibles: ");
        patacas=obx.nextInt();
        Restaurante restaurante = new Restaurante();
        restaurante.engadirPolbo(50);
        System.out.println("Kilos= "+restaurante.getPolbo());

        
        
        
    }
    
}
