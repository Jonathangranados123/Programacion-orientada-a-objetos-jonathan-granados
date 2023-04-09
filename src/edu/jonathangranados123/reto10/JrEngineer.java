package edu.jonathangranados123.reto10;
/**
 * Representa a un ingeniero junior.
 */
public class JrEngineer extends empleados implements programer{

    /**
     * Implementación del método para programar de la interfaz Programmer.
     */

    @Override
    public void progrmar() {
        System.out.println("programa como puede");
    }


}