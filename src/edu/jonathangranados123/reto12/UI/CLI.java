package edu.jonathangranados123.reto12.UI;
import edu.jonathangranados123.reto12.Process.Employee;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CLI {


        public static List<Employee> showMenu() {
            List<String> lines = new ArrayList<>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\jesus\\OneDrive\\Documentos\\apuntes\\txt_reto12.txt"));
                String line = reader.readLine();

                while (line != null) {
                    lines.add(line);
                    line = reader.readLine();
                }
                reader.close();

                Collections.sort(lines);
                List<Employee> jrs = LecturaDeArchivo();

                for (String l : lines) {
                    System.out.println(l);
                }

                // Resto del código...
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        /**
         * Método que sirve para crear y leer un ArrayList con base al contenido de un documento txt situado en el computador
         */
        static List<Employee> LecturaDeArchivo() {
            String fileName = "C:\\Users\\jesus\\OneDrive\\Documentos\\apuntes\\txt_reto12.txt";
            Path file = Paths.get(fileName);
            List<Employee> jrs = new ArrayList<>();
            try {
                for (String line : Files.readAllLines(file)) {
                    String[] splitVal = line.split(";");
                    String nombre = splitVal[1];
                    int edad = Integer.parseInt(splitVal[2].trim());
                    String rfc = splitVal[3];
                    Employee jrEngineer = new Employee(nombre, edad, rfc);
                    jrs.add(jrEngineer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return jrs;
        }

}


