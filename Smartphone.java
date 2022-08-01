package myjavasmartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone {
    private List<Kontakt> meineKontakte;

    public Smartphone() {
        meineKontakte = new ArrayList<Kontakt>();
    }

    public boolean findKontakt (Kontakt name){

        for( Kontakt  KontaktInListe : meineKontakte){

            if (name.getName().equals(KontaktInListe.getName()));
            System.out.printf("Kontakt ist bereit da ");
            return  false;
        }
        return  true;

    }

    public  boolean addKontakt (Kontakt neuerKontakt){
        if (findKontakt(neuerKontakt)== true){
            meineKontakte.add(neuerKontakt);
        }
        else
        {
            System.out.println("kontakt kann nicht hinzugefuegt");
            return false;
        }
        return true;
    }
}
