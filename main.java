package myjavasmartphone;

public class main {
    public static void main(String[] args) {

        Smartphone iphone8 = new Smartphone();
        iphone8.addKontakt(Kontakt.newKontakt("noumi ",0123  ));
        iphone8.addKontakt(Kontakt.newKontakt("lionel ",4321  ));
        iphone8.addKontakt(Kontakt.newKontakt("ulrich ",9876  ));
        iphone8.addKontakt(Kontakt.newKontakt("fally ",6732  ));

        iphone8.ausgabe();

    }
}
