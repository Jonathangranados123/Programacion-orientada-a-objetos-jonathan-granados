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

        printEmployeesOverTwenty(lista);


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
        lista.add(new JrEngineer("Juanito", 19,"HJGHJGOKHJ6542"));
        lista.add(new JrEngineer("Mauricio", 18,"BJHUFIOK65563"));
        lista.add(new JrEngineer("Antonio", 20,"FDSF564F5DS46F"));
        lista.add(new JrEngineer("Antonio", 20,"FDSFDS5456FDS4"));
        lista.add(new JrEngineer("Joel", 21,"DF5DS64F56456D"));
        lista.add(new JrEngineer("Jonathan", 35,"DSF4D56S45FD456"));
        lista.add(new JrEngineer("Erick", 26,"FFDSDF456456FD"));
        lista.add(new JrEngineer("Jairo", 30,"FDSF4D56SFDS456"));
        lista.add(new JrEngineer("Azul", 50,"FDDGFG456FDS546"));
        lista.add(new JrEngineer("Selene", 80,"RE45W6456TR465"));
        lista.add(new JrEngineer("Karen", 18,"JKDFS65FD4G4G"));
        lista.add(new JrEngineer("Arturo", 18,"FDS5GD56FGF6D5"));
        lista.add(new JrEngineer("Juan", 18,"DKLFGF465465D"));
        lista.add(new JrEngineer("Jose", 18,"FD45S64654SD4F"));
        lista.add(new JrEngineer("Mario", 18,"BJHUF45645656"));
        lista.add(new JrEngineer("Maria", 18,"BJHFD456456FDS5"));
        lista.add(new JrEngineer("Jaime", 18,"GF56D4G65GD546GFD"));
        lista.add(new JrEngineer("Antonio", 18,"GF4D56G456FD456"));
        lista.add(new JrEngineer("Alejandro", 18,"F4D564654DG64"));
        lista.add(new JrEngineer("Mauricio", 18,"BFDS45645GGF456"));

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
    public static void testReadfiles() {
        ArrayList<empleados> readlist = new ArrayList<>();
        String filename = "testFile.txt";
        Path file = Paths.get(filename);
        try {
            for (String line : Files.readAllLines(file)) {
                String[] parts = line.split(",");
                if (parts.length == 4 && parts[1].trim().equals("JrEngineer")) {
                    readlist.add(new JrEngineer(parts[0].trim(), Integer.parseInt(parts[2].trim()), parts[3].trim()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        printEmployeesOverTwenty(readlist);
    }



    public static void printEmployeesOverTwenty(List<empleados> lista) {
        List<empleados> empleadosMayoresDe20 = new ArrayList<>();
        for (empleados empleados : lista) {
            if (empleados.getEdad() > 20) {
                System.out.println(empleados);
                empleadosMayoresDe20.add(empleados);
            }
        }
    }
   //lee el archivo y carga la lista de empleados en readlist

}