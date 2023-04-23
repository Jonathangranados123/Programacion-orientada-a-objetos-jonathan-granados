package edu.jonathangranados123.reto10;
import java.awt.geom.PathIterator;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Esta clase contiene el método main que se utiliza para probar el polimorfismo en las diferente
 *
 * s clases del programa.
 */
public class Test {
    /**
     * El método main crea objetos de diferentes tipos y los utiliza para probar los métodos que hacen uso de polimorfismo.
     *
     * @param args Los argumentos de la línea de comandos, no se utilizan en este caso.
     */
    public static void main(String[] args) {
        // Crear objetos de diferentes tipos
        JrEngineer jr = new JrEngineer();
        SrEngineer sr = new SrEngineer();
        CEO ceo = new CEO();
        Manager manager = new Manager();
        RH rh = new RH();

        // Crear objetos con variables de tipo padre
        empleados emp1 = jr;
        empleados emp2 = ceo;
        empleados emp3 = rh;
        programer prog = sr;

        // Invocar métodos que usen polimorfismo
        testProgrammer(jr);
        testProgrammer(sr);

        testEmployee(emp1);
        testEmployee(emp2);
        testEmployee(emp3);
        testInterviewer(manager);
        testInterviewer(ceo);
        testInterviewer(rh);
        ArrayList<empleados> lista = new ArrayList<>();
        lista.add(new JrEngineer("juanito", 19));
        lista.add(new JrEngineer("mauricio", 21));
        lista.add(new JrEngineer("antonio", 34));
        HashMap<empleados, String> map = new HashMap<>();
        map.put(new JrEngineer("juanito", 19), "juanito");
        JrEngineer jr8 = new JrEngineer("juanito,", 19);
        System.out.println(map.get(jr8));
        testflies();


    }

    /**
     * El método testProgrammer utiliza polimorfismo para probar el método programar de la interfaz programer.
     *
     * @param p Un objeto que implemente la interfaz programer.
     */
    static void testProgrammer(programer p) {

        p.progrmar();
        System.out.println("Test programmer: " + p.getClass().getSimpleName());
    }

    /**
     * El método testEmployee utiliza polimorfismo para probar el método traabajar de la clase empleados.
     *
     * @param e Un objeto de la clase empleados o alguna de sus subclases.
     */
    static void testEmployee(empleados e) {
        e.traabajar();
        System.out.println("Test employee: " + e.getClass().getSimpleName());
    }

    /**
     * El método testInterviewer utiliza polimorfismo para probar el método entrevistar de la interfaz Entrivistador.
     *
     * @param i Un objeto que implemente la interfaz Entrivistador.
     */
    static void testInterviewer(Entrivistador i) {
        i.entrevistar();
        System.out.println("Test interviewer: " + i.getClass().getSimpleName());
    }

    static void testflies() {
        ArrayList<empleados> lista = new ArrayList<>();
        lista.add(new JrEngineer("Juanito", 19));
        lista.add(new JrEngineer("Mauricio", 18));
        lista.add(new JrEngineer("Antonio", 20));
        lista.add(new JrEngineer("Epignemio", 10));
        lista.add(new JrEngineer("Joel", 21));
        lista.add(new JrEngineer("Jonathan", 35));
        lista.add(new JrEngineer("Erick", 26));
        lista.add(new JrEngineer("Jairo", 30));
        lista.add(new JrEngineer("Azul", 50));
        lista.add(new JrEngineer("Selene", 80));
        String filename = "testFile.txt";
        Path file = Paths.get(filename);

        try {
            List<String> lines = lista
                    .stream()
                    .map(empleados::toString)
                    .collect(Collectors.toList());
            Files.write(file, lines);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    static void testReadfiles() {
        ArrayList<empleados> readlist = new ArrayList<>();
        String filename = "testfile.txt";
        Path file = Paths.get(filename);
        try {
            for (String line : Files.readAllLines(file)) {
                String[] parts = line.split(",");
                String nombre = parts[0];
                int edad = Integer.parseInt(parts[1].trim());
                readlist.add(new JrEngineer(nombre, edad));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void printEmployeesOverTwenty(ArrayList<empleados> lista) {
        for (empleados emp : lista) {
            if (emp.getEdad() > 20) {
                System.out.println(emp.toString());
            }
        }
        testReadfiles(); //lee el archivo y carga la lista de empleados en readlist
        printEmployeesOverTwenty(lista); //imprime los empleados mayores a 20 años
    }

}