package edu.jonathangranados123.reto2.boletos.process;

public class Tickets {

        public static double Price_child=70;
        public static double Price_adult= 100;
        public static double Price_old=70;
        public static double Price_oldInapam=50;

    public static double calcularCosto(int numChild,int numAdult, int numOld,int numOldinapam){
        return (numChild * Price_child) + (numAdult * Price_adult) + (numOld * Price_old) + (numOldinapam * Price_oldInapam);
    }

}

