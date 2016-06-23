package mazur.goit.module3.musicStore.store;

import mazur.goit.module3.musicStore.IncorrectInstrumentKey;
import mazur.goit.module3.musicStore.WrongInstrumentKeyException;

import java.util.*;

public class Store {

    Map<String, Integer> instrumentInShop;
    List<Instrument> instruments;
    Map<String, Integer> currentOrder;

    public Store(){
        instrumentInShop = new HashMap<>();
        instruments = new ArrayList<>();
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> oreder) throws WrongInstrumentKeyException, IncorrectInstrumentKey{

        this.currentOrder = oreder;

        List<Instrument> instrumentForOrder = new ArrayList<>();
        Set<String> keySet = this.currentOrder.keySet();

        for (String key : keySet){
            if (this.instrumentInShop.get(key) == null){
                throw new IncorrectInstrumentKey("You want something wrong from me ");
            }
            availibilityCheck(key);
            instrumentForOrder.addAll(getInstrumentsFromWarehouse(key));
        }
        return instrumentForOrder;
    }

    public boolean addInstrumentToShop(Instrument instrument){
        if(instrumentInShop.get(instrument.getName()) == null){
            instrumentInShop.put(instrument.getName(), 0);
        }
        instrumentInShop.put(instrument.getName(), instrumentInShop.get(instrument.getName())+1);
        return instruments.add(instrument);
    }

    private void availibilityCheck(String instrumentKey) throws WrongInstrumentKeyException{
        int instrumentNumberInOrder = this.currentOrder.get(instrumentKey);
        int instrumentNumberInShop = instrumentInShop.get(instrumentKey);
        if (instrumentNumberInOrder > instrumentNumberInShop){
            throw new WrongInstrumentKeyException("There is no so many pianos in our Shop");
        }
    }

    public List<Instrument> getInstrumentsFromWarehouse(String instrymentKey) {
        List<Instrument> instrumentsFromWarehouse = new ArrayList<>();
        for (int i = 0; i < this.currentOrder.get(instrymentKey) ; i++) {
            if (instrumentsFromWarehouse.size() == this.currentOrder.get(instrymentKey)) break;
            for (int j = 0; j < instruments.size(); j++) {
                Instrument instrument = this.instruments.get(j);
                if(instrumentsFromWarehouse.size() == this.currentOrder.get(instrymentKey)) break;
                else if (instrument.getName().equals(instrymentKey)){
                    instrumentsFromWarehouse.add(instrument);
                    this.instruments.remove(instrument);
                }
            }
        }
        return instrumentsFromWarehouse;
    }

    public Map<String, Integer> getInstrumentInShop() {
        return instrumentInShop;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }
}
