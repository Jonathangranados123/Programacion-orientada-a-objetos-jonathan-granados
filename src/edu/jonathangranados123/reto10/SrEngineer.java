package edu.jonathangranados123.reto10;

/**
 * La clase SrEngineer representa a un empleado ingeniero senior.
 *
 * Esta clase extiende la clase JrEngineer e implementa la interfaz Entrivistador.
 */
public class SrEngineer extends JrEngineer implements Entrivistador {


    /**

     Anula el método progrmar de la interfaz del programador e imprime un mensaje en la consola.
     */
    @Override
    public void progrmar() {
        System.out.println("programa como quiere");
    }
    /**

     Implementa el método entrevistar de la interfaz Entrivistador e imprime un mensaje en la consola.
     */
    @Override
    public void entrevistar() {
        System.out.println("pregunta cosas tecnicas");

    }
}