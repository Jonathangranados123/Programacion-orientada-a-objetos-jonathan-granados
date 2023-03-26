package edu.jonathangranados123.practicas;

import java.util.Random;

    public class Ayudante {
        private int ojos;
        private String piel;
        private String altura;
        private int nivel_crear;
        private int nivel_arreglar;
        private int nivel_destruir;

        public Ayudante(int ojos, String piel, String altura, int nivel_crear, int nivel_arreglar, int nivel_destruir) {
            this.ojos = ojos;
            this.piel = piel;
            this.altura = altura;
            this.nivel_crear = nivel_crear;
            this.nivel_arreglar = nivel_arreglar;
            this.nivel_destruir = nivel_destruir;
        }

        public String toString() {
            return "Un ayudante con " + ojos + " ojos, piel " + piel + ", altura " + altura + ", nivel para crear " + nivel_crear + ", nivel para arreglar " + nivel_arreglar + ", y nivel destructivo " + nivel_destruir + ".";
        }

        public static void main(String[] args) {
            int ayudantes_necesarios = 5;
            int[] ojos_posibles = {1, 2};
            String[] piel_posibles = {"amarilla", "morada"};
            String[] altura_posibles = {"mediano", "alto"};
            int[] nivel_posibles = {1, 2, 3, 4, 5};

            Ayudante[] ayudantes = new Ayudante[ayudantes_necesarios];

            Random random = new Random();
            for (int i = 0; i < ayudantes_necesarios; i++) {
                int ojos = ojos_posibles[random.nextInt(ojos_posibles.length)];
                String piel = piel_posibles[random.nextInt(piel_posibles.length)];
                String altura = altura_posibles[random.nextInt(altura_posibles.length)];
                int nivel_crear = nivel_posibles[random.nextInt(nivel_posibles.length)];
                int nivel_arreglar = nivel_posibles[random.nextInt(nivel_posibles.length)];
                int nivel_destruir = nivel_posibles[random.nextInt(nivel_posibles.length)];
                ayudantes[i] = new Ayudante(ojos, piel, altura, nivel_crear, nivel_arreglar, nivel_destruir);
            }

            for (int i = 0; i < ayudantes_necesarios; i++) {
                System.out.println(ayudantes[i]);
            }
        }
    }
