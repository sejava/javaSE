package goit.module3.dz1;

import java.util.List;

/**
 * Created by pan on 04.06.16.
 */
public class File {
    private String name;
    private String directorys;
    private Directory directory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirectorys() {
        return directorys;
    }

    public void setDirectorys(String directorys) {
        this.directorys = directorys;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
