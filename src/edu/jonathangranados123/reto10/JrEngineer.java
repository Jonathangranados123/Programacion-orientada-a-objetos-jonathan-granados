package edu.jonathangranados123.reto10;
/**
 * Representa a un ingeniero junior.
 */

public class JrEngineer extends empleados implements programer {
    public JrEngineer(String name, int i) {
        super(name, i);
    }
protected String RFC;
    @Override
    public String toString() {
        return "JrEngineer;" +
                 nombre +
                ";" + edad +";"+RFC
                ;
    }
    public JrEngineer(String RFC) {
        this.RFC = RFC;
    }

    public JrEngineer(String nombre, int edad, String RFC) {
        super(nombre, edad);
        this.RFC = RFC;
    }



    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public void traabajar() {
        super.traabajar();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public JrEngineer() {
        super();
        this.RFC= RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * Implementación del método para programar de la interfaz Programmer.
     */


    @Override
    public void progrmar() {
        System.out.println("programa como puede");
    }

    @Override
    public int compareTo(empleados o) {
        return 0;
    }
    public static JrEngineer fromString(String data) {
        String[] parts = data.split(",");
        String name = parts[0];
        int age = Integer.parseInt(parts[1]);
        return new JrEngineer(name, age);
    }

}


