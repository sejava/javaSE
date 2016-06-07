package goit.module3.flowers;

import java.util.List;

/**
 * Created by pan on 08.06.16.
 */
public class FlowerBouquet {
    private List<Flower> flowerses;

    public List<Flower> getFlowerses() {
        return flowerses;
    }

    public void setFlowerses(List<Flower> flowerses) {
        this.flowerses = flowerses;
    }

    public void addFlower(Flower flower){
        this.flowerses.add(flower);
    }
}
