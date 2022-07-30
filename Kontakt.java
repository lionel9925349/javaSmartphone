package myjavasmartphone;

public class Kontakt {

    private String name;
    private int telefonNummer;

    public Kontakt(String name, int telefonNummer) {
        super();
        this.name = name;
        this.telefonNummer = telefonNummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelefonNummer() {
        return telefonNummer;
    }

    public void setTelefonNummer(int telefonNummer) {
        this.telefonNummer = telefonNummer;
    }


    public static Kontakt newKontakt (String name , int nummer){
        return new Kontakt(name,nummer);

    }

}
