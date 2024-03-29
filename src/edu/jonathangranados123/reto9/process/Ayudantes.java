package edu.jonathangranados123.reto9.process;
import java.util.Random;


/**

 Esta clase representa a un conjunto de ayudantes que pueden ser creados y descritos mediante sus características.

 Cada ayudante tiene un número de ojos, color de piel, altura y niveles de habilidad para destruir, crear y arreglar cosas.
 La clase tiene un constructor que toma como parámetros todas las variables de instancia mencionadas
 anteriormente, y las inicializa con los valores correspondientes.

 En resumen, esta clase sirve para crear y describir un conjunto de ayudantes con diferentes
 características, utilizando valores aleatorios generados por la clase Random.

 */

public class Ayudantes {
    public int numeroDeOjos;
    public String colorDePiel;
    public String altura;
    public int nivelDestructivo;
    public int nivelDecreacion;
    public int nivelDearreglar;

    public Ayudantes(int numeroDeOjos, String colorDePiel, String altura,
                     int nivelDestructivo, int nivelDecreacion, int nivelDearreglar) {
        this.numeroDeOjos = numeroDeOjos;
        this.colorDePiel = colorDePiel;
        this.altura = altura;
        this.nivelDestructivo = nivelDestructivo;
        this.nivelDecreacion = nivelDecreacion;
        this.nivelDearreglar = nivelDearreglar;
    }

    public static Ayudantes[] crearAyudantes(int cantidad) {
        Ayudantes[] ayudantes = new Ayudantes[cantidad];

        String[] coloresDePiel = {"amarillo", "morado"};
        String[] alturas = {"mediano", "alto"};
        int[] cantidadOjos = {1, 2};
        int[] creacion = {1, 2, 3, 4, 5};
        int[] destruccion = {1, 2, 3, 4, 5};
        int[] reparacion = {1, 2, 3, 4, 5};

        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int ojos = cantidadOjos[random.nextInt(cantidadOjos.length)];
            String piel = coloresDePiel[random.nextInt(coloresDePiel.length)];
            String altura = alturas[random.nextInt(alturas.length)];
            int nivel_crear = creacion[random.nextInt(creacion.length)];
            int nivel_arreglar = reparacion[random.nextInt(reparacion.length)];
            int nivel_destruir = destruccion[random.nextInt(destruccion.length)];
            ayudantes[i] = new Ayudantes(ojos, piel, altura, nivel_crear, nivel_arreglar, nivel_destruir);
        }

        return ayudantes;
    }

    public String mostrarCaracteristicas() {
        return "Tiene " + numeroDeOjos + " ojos, piel " + colorDePiel + ", altura " + altura +
                ", nivel para crear " + nivelDecreacion + ", nivel para arreglar " + nivelDearreglar +
                ", y nivel destructivo " + nivelDestructivo + ".";
    }
}