package edu.jonathangranados123.reto12.UI;
import edu.jonathangranados123.reto12.Process.JrEngineer;

import java.awt.geom.PathIterator;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;

import java.io.BufferedReader;

import java.io.FileReader;


import java.util.*;
import java.util.stream.Collectors;

public class CLI {

    public static void showMenu(){
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\jesus\\OneDrive\\Documentos\\apuntes\\txt_reto12.txt"));
            String line = reader.readLine();

            List<JrEngineer> empleados = new ArrayList<>();
            while (line != null){
                String[] parts = line.split(",");
                if (parts.length >= 2) {  // verifica que la línea tenga al menos dos elementos
                    String nombre = parts[0].trim();
                    int edad = Integer.parseInt(parts[1].trim());
                    empleados.add(new JrEngineer(nombre, edad));
                }
                line = reader.readLine();
            }


            reader.close();

            List<JrEngineer> empleadosFiltrados = empleados.stream()
                    .filter(e -> e.getEdad() >= 20 && e.getEdad() <= 25)
                    .collect(Collectors.toList());

            for (JrEngineer empleado : empleadosFiltrados) {
                System.out.println(empleado.getNombre() + " - " + empleado.getEdad());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}