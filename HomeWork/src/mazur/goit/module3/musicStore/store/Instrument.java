package mazur.goit.module3.musicStore.store;

/**
 * Created by pan on 18.06.16.
 */
public class Instrument {

    public static final String PIANO_KEY = "piano";
    public static final String GUITAR_KEY = "guitar";
    public static final String TRUMPET_KEY = "trumpet";

    private String model;
    private String country;

    private String name;

    public Instrument(String name) {
        this.name = name;
    }

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
}
