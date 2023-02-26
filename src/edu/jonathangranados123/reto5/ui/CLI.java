package edu.jonathangranados123.reto5.ui;

import edu.jonathangranados123.reto5.process.AdivinaLaPalabra;
import java.util.Scanner;

public class CLI {
        public static void showMenu() {



                        Scanner sc = new Scanner(System.in);
                        String[] palabrasFacil = {"casa", "perro", "jugo", "luna"};
                        String[] palabrasIntermedio = {"elefante", "ampliado", "ecosistema", "computadora"};
                        String[] palabrasAvanzado = {"extravagante", "biodiversidad", "inmunodeficiencia", "desarrolladores"};

                        System.out.println("Bienvenido al juego de adivinar la palabra");
                        int opcion = 1;
                        while (opcion != 0) {
                                System.out.println("Seleccione el nivel de dificultad:");
                                System.out.println("1 - Fácil");
                                System.out.println("2 - Intermedio");
                                System.out.println("3 - Avanzado");
                                System.out.println("0 - Salir");
                                opcion = sc.nextInt();
                                if (opcion == 0) {
                                        break;
                                }
                                String[] palabras = null;
                                switch (opcion) {
                                        case 1:
                                                palabras = palabrasFacil;
                                                break;
                                        case 2:
                                                palabras = palabrasIntermedio;
                                                break;
                                        case 3:
                                                palabras = palabrasAvanzado;
                                                break;
                                        default:
                                                System.out.println("Opción inválida");
                                                break;
                                }
                                if (palabras != null) {
                                        AdivinaLaPalabra.jugar(palabras[(int) (Math.random() * palabras.length)]);
                                }
                        }
                        System.out.println("¡Gracias por jugar!");
                }

                private static void jugar (String palabra){
                }

        }
