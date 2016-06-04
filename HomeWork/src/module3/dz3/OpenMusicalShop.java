package goit.module3.dz3;

import java.util.List;

/**
 * Created by pan on 05.06.16.
 */
public class OpenMusicalShop {
    private String shopName;
    private List<MusicalInstrument> musicalInstruments;

    public void openShop (){

    }
    public void closeShop(){

    }

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
}
