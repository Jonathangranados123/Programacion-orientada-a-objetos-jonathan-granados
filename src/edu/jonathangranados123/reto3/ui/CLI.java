package edu.jonathangranados123.reto3.ui;

import java.util.Scanner;
import edu.jonathangranados123.reto3.process.Conversor;
public class CLI {
    public static void showMenu() {
        while (true) {
            String opcion;
            Scanner scanner = new Scanner(System.in);
            System.out.println("*****MENU*****");
            System.out.println("Escoja la operación que decea realizar: ");
            System.out.println("a. Convertir de decimal a binario");
            System.out.println("b. Convertir de decimal a octal");
            System.out.println("c. Convertir de decimal a hexadecimal");
            System.out.println("d. Convertir de binario a decimal");
            System.out.println("e. Convertir de octal a decimal");
            System.out.println("f. Convertir de hexadecimal a decimal");
            System.out.println("s. SALIR");
            System.out.println("**************");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "a":
                    System.out.println("Ingrese un número en decimal: ");
                    Conversor.decimal = scanner.nextInt();
                    Conversor.DecimalesABinario();
                    break;
                case "b":
                    System.out.println("Ingrese un número decimal: ");
                    Conversor.decimal = scanner.nextInt();
                    Conversor.DecimalesAOctal();
                    break;
                case "c":
                    System.out.println("Ingrese un número decimal:");
                    Conversor.decimal = scanner.nextInt();
                    Conversor.DecimalesAHexadecimales();
                    break;
                case "d":
                    System.out.println("Ingrese un número binario: ");
                    Conversor.numBinario = scanner.nextInt();
                    Conversor.BinariosADecimales();
                    break;
                case "e":
                    System.out.println("Ingrese un número octal: ");
                    Conversor.numOctal = scanner.nextInt();
                    Conversor.OctalesADecimales();
                    break;
                case "f":
                    System.out.println("Ingrese su número hexadecimal: ");
                    Conversor.hexadecimal = scanner.nextLine();
                    Conversor.HexadecimalesADecimales();
                    break;
                case "s":
                    System.out.println("¡Hasta pronto!");
                    return;
                default:
                    System.out.println("La opción que selecciono no es válida, por favor seleccione otra opción");
                    break;
            }

        }
    }
}