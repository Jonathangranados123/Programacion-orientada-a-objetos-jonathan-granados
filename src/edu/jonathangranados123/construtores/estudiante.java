package edu.jonathangranados123.construtores;

import java.util.Objects;

public class estudiante {
    public String NOMBRE;
    public int edad;
    public String MATRICULA;

    public estudiante(String NOMBRE, int edad) {
        this.NOMBRE = NOMBRE;
        this.edad = edad;
    }

    public estudiante() {
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        if(Objects.isNull(NOMBRE)){
            throw new java.lang.IllegalArgumentException("el nombre no es valido");
        }
        this.NOMBRE = NOMBRE;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMATRICULA() {
        return MATRICULA;
    }

    public void setMATRICULA(String MATRICULA) {

        this.MATRICULA = MATRICULA;
    }

    public estudiante(String NOMBRE) {
        setNOMBRE(NOMBRE);

    }

    public static void main(String[] args) {
        estudiante jona =new estudiante();
        jona.NOMBRE="jona";

        estudiante arnulfo = new estudiante();
        arnulfo.NOMBRE="ARNULFO";
        System.out.println(arnulfo);
        System.out.println(jona.equals(arnulfo));
        System.out.println(jona);
        estudiante antonio =new estudiante("antonio");
        estudiante antonio2 =new estudiante(null);
        System.out.println(antonio2);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof estudiante that)) return false;
        return edad == that.edad && Objects.equals(NOMBRE, that.NOMBRE);
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "NOMBRE='" + NOMBRE + '\'' +
                ", edad=" + edad +
                ", MATRICULA='" + MATRICULA + '\'' +
                '}';
    }

    public estudiante(String NOMBRE, int edad, String MATRICULA) {
        this.NOMBRE = NOMBRE;
        this.edad = edad;
        this.MATRICULA = MATRICULA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(NOMBRE, edad);

    }
}



