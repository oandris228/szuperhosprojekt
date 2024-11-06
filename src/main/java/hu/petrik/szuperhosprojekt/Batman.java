package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos, Milliardos {
    private float lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos s) {
        return s.mekkoraAzEreje() < lelemenyesseg;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    @Override
    public String toString() {
        String formatted = String.format("Batman: leleményesség: %.0f", lelemenyesseg);
        return formatted;
    }
}
