package myjavasmartphone;

import java.util.ArrayList;

public class AdresseBuch {
    public static void main(String[] args) {
        Adresse peterAdresse = new Adresse("Peter","Eichendorffring 99", "Berlin");
        Adresse hansAdresse = new Adresse("hans","sternstr 99", "frankfurt");
        Adresse michaelAdresse = new Adresse("michael","kreisstr 4", "Giessen");

        ArrayList<Adresse> adressenListe = new ArrayList<Adresse>();

        adressenListe.add(peterAdresse);
        adressenListe.add(hansAdresse);
        adressenListe.add(michaelAdresse);

        //Ausgabe der Liste
        for( Adresse addresse : adressenListe){
            System.out.printf("Name: " + addresse.getName() + " Straße : " + addresse.getStraße() + " Stadt: " + addresse.getStadt());
        }

    }
}
