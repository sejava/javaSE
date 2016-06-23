package mazur.goit.module3.musicStore;

/**
 * Created by pan on 17.06.16.
 */
public class WrongInstrumentKeyException extends Exception{

    public WrongInstrumentKeyException() {
    }

    public WrongInstrumentKeyException(String massage){
        super(massage);
    }
}
