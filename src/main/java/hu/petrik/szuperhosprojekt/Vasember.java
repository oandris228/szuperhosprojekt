package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos {
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        return getSzuperero() > 1000;
    }

    @Override
    public void kutyutKeszit() {

        Random rand = new Random();
        this.setSzuperero(rand.nextInt(10)*this.getSzuperero());
    }

    @Override
    public String toString() {
        if (this.isVanEGyengesege()) {
            String formatted = String.format("Vasember Szupererő: + %.2f; van gyengesége", getSzuperero());
            return formatted;
        }
        else {
            String formatted = String.format("Vasember Szupererő: + %.2f; nincs gyengesége", getSzuperero());
            return formatted;
        }
    }
}
