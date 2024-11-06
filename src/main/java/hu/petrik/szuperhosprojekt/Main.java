package hu.petrik.szuperhosprojekt;

public class Main {

    public static void main(String[] args) {
        try {
            Kepregeny.szereplok("szuperhos.txt");
            Kepregeny.szuperhosok();
        } catch ( final Exception e ) {
            e.printStackTrace();
        }
    }
}