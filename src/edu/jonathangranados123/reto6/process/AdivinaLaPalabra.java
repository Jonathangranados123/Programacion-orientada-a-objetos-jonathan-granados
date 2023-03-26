package edu.jonathangranados123.reto6.process;

import java.util.Scanner;
/**
 en esta clase se realizan los procesos necesarios para que
 nuestro juego pueda tener  los intetos necesarios como para que
 el mismo funcione de la manera que nosostros esperamos
 @author jonathan peña
 @author Arnulfo Ramos
 */

public class AdivinaLaPalabra {
    public static String letra = "";

    public static void jugar(String palabra) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;
        String palabraAdivinada = "";
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinada += "X";
        }
        while (intentos > 0 && !palabraAdivinada.equals(palabra)) {
            System.out.println("La palabra a adivinar es: " + palabraAdivinada);
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println("Ingrese una letra: ");
            letra = scanner.nextLine().toLowerCase();

                try {
                    letra =scanner.nextLine().toLowerCase();
                    if (letra.equals("0")) {
                        return;
                    }
                    if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
                        throw new IllegalArgumentException();
                    }
                } catch (IllegalArgumentException exception) {
                    System.out.println("Favor de ingresar una letra válida");
                    continue;
                }


                boolean acerto = false;
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra.charAt(0)) {
                        palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i + 1);
                        acerto = true;

                    }
                }
                if (acerto) {

                } else {
                    System.out.println("Inténtalo de nuevo");
                    intentos--;
                }
            }
            if (palabraAdivinada.equals(palabra)) {
                System.out.println("¡Felicitaciones! Adivinaste la palabra " + palabra);
            } else {
                System.out.println("¡Lo siento! No adivinaste la palabra " + palabra);

            }


        }
    }



