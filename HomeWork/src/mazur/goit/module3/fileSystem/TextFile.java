package mazur.goit.module3.fileSystem;

/**
 * Created by pan on 08.06.16.
 */
public class TextFile extends File {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
