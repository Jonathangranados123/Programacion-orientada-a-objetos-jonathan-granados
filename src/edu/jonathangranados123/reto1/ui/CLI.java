package edu.jonathangranados123.reto1.ui;
import edu.jonathangranados123.reto1.process.Calculadora;

import java.util.Scanner;
public class CLI {
    public static void MostrarMenu(){
        System.out.println("Selecciona una opcion");
        System.out.println("suma");
        System.out.println("resta");
        System.out.println("multiplicacion");

        Scanner scanner = new Scanner (System.in);

        int option = scanner.nextInt(); scanner.nextLine();

        System.out.println("introduce el primer valor");
        int operando1 = scanner.nextInt();scanner.nextLine();
        System.out.println("introduce el segundo valor");
        int operando2 = scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion ="";

        switch (option){
            case 1:
                resultado = Calculadora.sumarNumeros(operando1, operando2);
                break;
        }


    }
}
