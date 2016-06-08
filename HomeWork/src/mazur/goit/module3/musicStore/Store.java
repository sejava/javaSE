package mazur.goit.module3.musicStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pan on 08.06.16.
 */
public class Store {
    List<Instrument> instruments;
    Map<String, Integer> inst = new HashMap<String, Integer>();
    // inst.put("piano", 2);
    // inst.put("guitar", 16);
    // inst.put("trumpet", 7);

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order){
        final Map<String, Integer> mapiS = new HashMap<String, Integer>();



        return (List<Instrument>) mapiS;
    }


}
