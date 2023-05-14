package edu.jonathangranados123.retoFinal;

public class Heroe {
   public int vida;
public int hadasRescatadas;

    public Heroe(int vida) {
        this.vida = vida;
        this.hadasRescatadas = 0;
    }

    public int getVida() {
        return vida;
    }

    public int getHadasRescatadas() {
        return hadasRescatadas;
    }

    public void aumentarVida() {
        vida++;
    }

    public void rescatarHada() {
        hadasRescatadas++;
    }

    public void recibirDamage(int Damage) {
        vida -= Damage;
    }
}

