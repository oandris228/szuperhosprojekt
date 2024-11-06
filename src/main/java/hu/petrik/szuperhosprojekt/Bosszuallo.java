package hu.petrik.szuperhosprojekt;

abstract class Bosszuallo implements Szuperhos {
    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;


    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos s) {
        if (s instanceof Batman) {
            return s.mekkoraAzEreje() <= szuperero/2 && vanEGyengesege;
        } else {
            if (s.mekkoraAzEreje() <= szuperero && vanEGyengesege) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public String toString() {
        if (vanEGyengesege) {
            String formatted = String.format("Szupererő: + %.2f; van gyengesége", szuperero);
            return formatted;
        }
        else {
            String formatted = String.format("Szupererő: + %.2f; nincs gyengesége", szuperero);
            return formatted;
        }
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    @Override
    public float mekkoraAzEreje() {
        return szuperero;
    }
}
