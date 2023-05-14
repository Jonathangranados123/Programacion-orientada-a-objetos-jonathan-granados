package edu.jonathangranados123.retoFinal;
/**

 La clase Jugador representa al héroe controlado por el usuario en el juego. Hereda de la clase Heroe.

 Tiene un constructor que recibe un parámetro de vida y lo pasa al constructor de la superclase Heroe.

 También tiene un método enfrentarOgro() que recibe un objeto de la clase Villano como parámetro.

 Este método calcula un daño aleatorio infligido por el jugador y el ogro, y actualiza la vida del jugador y el poder del mago.
 */

    public class Jugador extends Heroe {
        public Jugador(int vida) {
            super(vida);
        }
    /**

     Método que representa al jugador enfrentándose a un ogro. Recibe un objeto de la clase Villano como parámetro.
     Calcula un daño aleatorio infligido por el jugador y el ogro, y actualiza la vida del jugador y el poder del mago.
     @param mago el ogro a enfrentar
     */
        public void enfrentarOgro(Villano mago) {
            int DamageOgro = (int) (Math.random() * 4) + 1;
            int DamageJugador = (int) (Math.random() * 3) + 1;
            setVida(getVida() - DamageOgro);
            mago.setPoder(mago.getPoder() + DamageJugador);
            System.out.println("¡Te has enfrentado al ogro!");
            System.out.println("El ogro te ha golpeado con " + DamageOgro + " de daño.");
            System.out.println("Tu contraataque ha hecho que el mago pierda " + DamageJugador + " de poder.");

        }
    /**

     Método privado que establece la vida del jugador.
     @param i el valor de vida a establecer
     */
        private void setVida(int i) {
        }
    }


