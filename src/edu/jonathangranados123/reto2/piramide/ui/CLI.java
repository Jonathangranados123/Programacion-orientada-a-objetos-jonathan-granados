package edu.jonathangranados123.reto2.piramide.ui;

import java.util.Scanner;

public class CLI {
    public static void piramidechida(){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int altura = entrada.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




