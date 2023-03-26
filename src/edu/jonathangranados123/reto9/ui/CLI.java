package edu.jonathangranados123.reto9.ui;
import edu.jonathangranados123.reto9.process.Ayudantes;
import java.util.Scanner;
public class CLI {

        private static Scanner scanner = new Scanner(System.in);

        public static int pedirCantidadAyudantes() {
            System.out.print("Ingrese la cantidad de ayudantes a crear: ");
            return scanner.nextInt();
        }

        public static void mostrarAyudantes(Ayudantes[] ayudantes) {
            for (Ayudantes ayudante : ayudantes) {
                System.out.println(ayudante.mostrarCaracteristicas());
            }
        }
    }

