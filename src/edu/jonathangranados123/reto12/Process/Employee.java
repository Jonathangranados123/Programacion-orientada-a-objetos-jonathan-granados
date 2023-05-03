package edu.jonathangranados123.reto12.Process;

public class Employee {
    public Employee() {
    }

    private String nombre;
    private String RFC;
    private int edad;

    public Employee(String nombre, int edad, String  RFC) {
        this.nombre = nombre;
        this.edad = edad;
        this.RFC=RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
}







