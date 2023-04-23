package edu.jonathangranados123.reto10;
/**
 * Representa a un gerente.
 */
public class Manager extends empleados implements Entrivistador{

    public Manager(String nombre, int edad) {
        super(nombre, edad);
    }

    public Manager() {
    }

    /**
     * Implementación del método para realizar una entrevista de la interfaz Interviewer.
     */
    @Override
    public void entrevistar() {
        System.out.println("si fueses un ani");
    }

    @Override
    public int compareTo(empleados o) {
        return 0;
    }
}
