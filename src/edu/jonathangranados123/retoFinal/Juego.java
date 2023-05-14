package edu.jonathangranados123.retoFinal;
/**

 Esta clase representa un juego en el que el jugador debe rescatar hadas y derrotar a un mago.
 El jugador tiene un nivel de vida y un poder mágico que disminuye cada vez que construye una casa
 para rescatar a un hada y aumenta cada vez que lucha contra un ogro.
 Si el jugador construye 10 casas, sube un nivel de vida y el poder del mago aumenta en 1.
 El jugador pierde si su nivel de vida llega a 0 o si el poder del mago llega a 0.
 */
import java.util.Scanner;

public class Juego {
    /**
     * Método principal que ejecuta el juego.
     *
     * @param args los argumentos pasados al programa
     */

        public static void main(String[] args) {
            int hadasRescatadas = 0;
            int poderMago = 10;
            int vidaJugador = 10;

            Scanner sc = new Scanner(System.in);
            // Mensaje de bienvenida y explicación del objetivo del juego
            System.out.println("Bienvenido/a a la Villa Mágica!");
            System.out.println("Tu misión es rescatar a todas las hadas y derrotar al mago.");

            while (poderMago > 0 && vidaJugador > 0) {
                // Muestra información del estado actual del juego
                System.out.println("Hadas rescatadas: " + hadasRescatadas);
                System.out.println("Poder del mago: " + poderMago);
                System.out.println("Tu nivel de vida: " + vidaJugador);
                System.out.println("¿Qué deseas hacer?");
                // Muestra las opciones disponibles para el jugador
                System.out.println("1. Construir una casa para rescatar un hada.");
                System.out.println("2. Luchar contra el ogro.");
                int opcion = sc.nextInt();
                // Ejecuta la acción elegida por el jugador
                switch (opcion) {
                    case 1:
                        if (poderMago > 0) {
                            System.out.println("Construyendo una casa...");
                            hadasRescatadas++;
                            poderMago--;
                            if (hadasRescatadas % 10 == 0) {
                                vidaJugador++;
                                System.out.println("¡Has subido de nivel de vida!");
                            }
                            System.out.println("¡Has rescatado a un hada!");
                        } else {
                            System.out.println("Lo siento, el mago ya no tiene más poder.");
                        }
                        break;
                    case 2:
                        int DamageOgro = (int) (Math.random() * 4) + 1;
                        int DamageJugador = (int) (Math.random() * 3) + 1;
                        vidaJugador -= DamageOgro;
                        poderMago += DamageJugador;
                        System.out.println("¡Te has enfrentado al ogro!");
                        System.out.println("El ogro te ha golpeado con " + DamageJugador + " de daño.");
                        System.out.println("Tu contraataque ha hecho que el mago pierda " + DamageJugador + " de poder.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
                // Verifica si se cumplen las condiciones para que el mago recupere poder
                if (hadasRescatadas % 10 == 0 && hadasRescatadas > 0) {
                    poderMago++;
                    System.out.println("El mago ha recuperado un poco de su poder.");
                }

                if (poderMago <= 0) {
                    System.out.println("¡Felicidades, has derrotado al mago y salvado la Villa Mágica!");
                }

                if (vidaJugador <= 0) {
                    System.out.println("Lo siento, has perdido. El mago ha triunfado.");
                }
            }

            sc.close();
        }

    }

