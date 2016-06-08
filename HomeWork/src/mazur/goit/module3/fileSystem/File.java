package mazur.goit.module3.fileSystem;

/**
 * Created by pan on 08.06.16.
 */
public class File {
    private String name;
    private int size;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
