package goit.module3.dz2;

import java.util.List;

/**
 * Created by pan on 05.06.16.
 */
public class Bukiet {
    private List<Flowers> flowersList;
    private List<Kust> Kust;

    public List<Flowers> getFlowersList() {
        return flowersList;
    }

    public void setFlowersList(List<Flowers> flowersList) {
        this.flowersList = flowersList;
    }

    public List<goit.module3.dz2.Kust> getKust() {
        return Kust;
    }

    public void setKust(List<goit.module3.dz2.Kust> kust) {
        Kust = kust;
    }
}
