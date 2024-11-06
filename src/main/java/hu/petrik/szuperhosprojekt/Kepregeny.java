package hu.petrik.szuperhosprojekt;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kepregeny {

    public static List<Szuperhos> szuperhosLista = new ArrayList<Szuperhos>();

    public static void szereplok( String link ) {
        try {
            File myObj = new File(link);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] line = data.split(" ");
                if (line[0] == "Batman") {
                    Batman batman = new Batman();
                    for (int i = 0; i < Integer.valueOf(line[1]); i++) {
                        batman.kutyutKeszit();
                    }
                    szuperhosLista.add(batman);
                } else {
                    Vasember vasember = new Vasember();
                    for (int i = 0; i < Integer.valueOf(line[1]); i++) {
                        vasember.kutyutKeszit();
                    }
                    szuperhosLista.add(vasember);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void szuperhosok() {
        for (Szuperhos sz : szuperhosLista) {
            System.out.println(sz);
        }
    }
}
