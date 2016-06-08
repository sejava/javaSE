package mazur.goit.module3.musicStore;

/**
 * Created by pan on 08.06.16.
 */
public class Instrument {
    private String name;
    private String model;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void example(){
        System.out.println("Instrument example");
    }
}
