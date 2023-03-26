package edu.jonathangranados123.reto9;
import edu.jonathangranados123.reto9.process.Ayudantes;
import edu.jonathangranados123.reto9.ui.CLI;

public class Main {
    public static void main(String[] args) {
        int cantidad = CLI.pedirCantidadAyudantes();
        Ayudantes[] ayudantes =
                Ayudantes.crearAyudantes(cantidad);
        CLI.mostrarAyudantes(ayudantes);
    }
}