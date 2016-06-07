package goit.module3.flowers;

/**
 * Created by pan on 05.06.16.
 */
public class Flower {
    private String name;
    private String color;
    private boolean isBloom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public boolean isBloom() {
        return isBloom;
    }

    public void setBloom(boolean bloom) {
        isBloom = bloom;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
