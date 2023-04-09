package edu.jonathangranados123.reto10;
/**
 * Esta clase contiene el método main que se utiliza para probar el polimorfismo en las diferentes clases del programa.
 */
public class Test {
    /**
     * El método main crea objetos de diferentes tipos y los utiliza para probar los métodos que hacen uso de polimorfismo.
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
    }
    /**
     * El método testProgrammer utiliza polimorfismo para probar el método programar de la interfaz programer.
     * @param p Un objeto que implemente la interfaz programer.
     */
    static void testProgrammer(programer p) {
        p.progrmar();
        System.out.println("Test programmer: " + p.getClass().getSimpleName());
    }
    /**
     * El método testEmployee utiliza polimorfismo para probar el método traabajar de la clase empleados.
     * @param e Un objeto de la clase empleados o alguna de sus subclases.
     */
    static void testEmployee(empleados e) {
        e.traabajar();
        System.out.println("Test employee: " + e.getClass().getSimpleName());
    }

    /**
     * El método testInterviewer utiliza polimorfismo para probar el método entrevistar de la interfaz Entrivistador.
     * @param i Un objeto que implemente la interfaz Entrivistador.
     */
    static void testInterviewer(Entrivistador i) {
        i.entrevistar();
        System.out.println("Test interviewer: " + i.getClass().getSimpleName());
    }
}
