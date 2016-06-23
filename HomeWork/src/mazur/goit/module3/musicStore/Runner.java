package mazur.goit.module3.musicStore;

import mazur.goit.module3.musicStore.store.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pan on 17.06.16.
 */
public class Runner {
    public static void main(String[] args) {
        Store musicStore = new Store();
        for (int i = 0; i < 10; i++) {
            musicStore.addInstrumentToShop(new Piano());
            musicStore.addInstrumentToShop(new Guitar());
            musicStore.addInstrumentToShop(new Trumpet());
        }
        System.out.println("Instruments in Shop befor order processing " + musicStore.getInstruments().size());

        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 2);
        order.put(Instrument.GUITAR_KEY, 2);
        order.put(Instrument.TRUMPET_KEY, 200);

        List<Instrument> instruments = new ArrayList<>();
        try {
            instruments = musicStore.prepareInstruments(order);
        }catch (WrongInstrumentKeyException ex){
            ex.printStackTrace();
        }catch (IncorrectInstrumentKey incorrectInstrumentKey){
            incorrectInstrumentKey.printStackTrace();
        }
    }
}
