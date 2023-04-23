package edu.jonathangranados123.reto10;

import java.util.Objects;

/**
 * Representa a los empleados de la empresa.
 */
public abstract class empleados implements Comparable<empleados> {
    /**
     * Realiza una tarea de trabajo genérica.
     *
     */
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    int edad;

    public empleados() {
    }

    public empleados(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void traabajar(){
        System.out.println("Hago la funcion asignada conforme a mi puesto");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof empleados empleados)) return false;
        return edad == empleados.edad && Objects.equals(nombre, empleados.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
