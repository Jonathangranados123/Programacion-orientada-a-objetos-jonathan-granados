package edu.jonathangranados123.reto10;
/**
 * Clase que representa a un empleado del departamento de Recursos Humanos. Esta clase hereda
 * de empleados y también implementa la interfaz {@link Entrivistador}.
 */
public class RH extends empleados implements Entrivistador {
    /**
     * Método que permite al empleado de RH realizar una entrevista, en este caso, preguntando sobre
     * el background del entrevistado. Esta implementación cumple con el contrato de la interfaz
     * Entrivistador.
     */
    @Override
    public void entrevistar() {
        System.out.println("preguntar el background");
    }
}