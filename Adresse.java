package myjavasmartphone;

public class Adresse {


    // Attribute
    private  String name;
    private String Straße;
    private  String stadt;

    //Konstruktor

    public Adresse(String name, String straße, String stadt) {
        super();
        this.name = name;
        this.Straße = straße;
        this.stadt = stadt;
    }




    // Methoden
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStraße() {
        return Straße;
    }

    public void setStraße(String straße) {
        Straße = straße;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }




}
