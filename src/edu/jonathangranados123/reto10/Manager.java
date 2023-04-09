package edu.jonathangranados123.reto10;
/**
 * Representa a un gerente.
 */
public class Manager extends empleados implements Entrivistador{

    /**
     * Implementación del método para realizar una entrevista de la interfaz Interviewer.
     */
    @Override
    public void entrevistar() {
        System.out.println("si fueses un ani");
    }
}
