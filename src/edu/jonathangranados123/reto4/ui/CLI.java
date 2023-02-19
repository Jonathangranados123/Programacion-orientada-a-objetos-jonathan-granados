package edu.jonathangranados123.reto4.ui;

import edu.jonathangranados123.reto4.process.AnalizarVentas;


public class CLI {
    /**
     * En esta clase se encuentra los datos de la tabla y el método para mostrar los resultados
     *
     * @autor Arnulfo Ramos
     * @autor Jonathan Peña
     */
    public static void showMenu() {
        String [] sabores = {""};
        int[][] ventas = {
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}
        };
        /**
         * Envía la tabla a los métodos de la clase AnalizarVentas e imprime los resultados
         */
        System.out.println("Chocolate: 111, 483, 471, 427 \nVainilla: 192, 500, 355, 158 \nFresa: 289, 470, 474, 160 \nOreo: 415, 114, 161, 308");
        for (int trimestres :
                AnalizarVentas.obtenerMaximaVentaPorTrimestre(ventas)){

            System.out.println("El trimestre que mejor vendio fue: " + AnalizarVentas.nombrarTrimestre(trimestres));
        }
        for (int trimestre :
                AnalizarVentas.obtenerMaximoTrimestre(ventas)){
            System.out.println("topi" + AnalizarVentas.nombrarTrimestre(trimestre));
            for (int maxTrimestre :
                    AnalizarVentas.obtenerMaximoTrimestre(ventas)){
                System.out.println( "El trimestre con mayor volumen de ventas fue el trimestre = " + AnalizarVentas.nombrarTrimestre(maxTrimestre));
            }

        }

    }
    }