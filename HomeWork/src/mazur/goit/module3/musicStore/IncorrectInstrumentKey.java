package mazur.goit.module3.musicStore;

/**
 * Created by pan on 17.06.16.
 */
public class IncorrectInstrumentKey extends Exception{

    public IncorrectInstrumentKey() {
    }

    public IncorrectInstrumentKey(String massage){
        super(massage);
    }
}
