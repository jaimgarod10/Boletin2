
package boletin2_1;

import java.util.Scanner;


public class Boletin2_1 {

   
    public static void main(String[] args) {
        // Sacar el porcentaje de descuento de una compra
        Scanner sc = new Scanner(System.in);
        System.out.println("precio_final");
        float precio_final= sc.nextFloat();        
        System.out.println("precio_incial");
        float precio_inicial= sc.nextFloat();
        float porcentaje= 100 - ( precio_final / precio_inicial )*100;
        System.out.println("El descuento en % es = "+Math.round(porcentaje));
    }
    
}
