package mazur.goit.module3.musicStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Test {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> nts = new HashMap<String, Integer>();
        nts = setMap(nts);
        getMap(prepareInstruments(nts));



    }
    public static Map<String, Integer> setMap(Map<String, Integer> map) throws IOException {
        Map<String, Integer> instKup = new HashMap<String, Integer>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Searc: \n pleas writ Instrument name");
            String instrum = reader.readLine();
            System.out.println("pleas write instrument val");
            Integer val = Integer.parseInt(reader.readLine());
            instKup.put(instrum, val);
        return instKup;
    }

    public static void getMap(Map<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ": " + value);
        }
    }

    public static Map<String, Integer>  prepareInstruments(Map<String, Integer> order){
        Map<String, Integer> inst = new HashMap<String, Integer>();
        inst.put("piano", 2);
        inst.put("guitar", 16);
        inst.put("trumpet", 7);

        Iterator<Map.Entry<String, Integer>> iterator = order.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            if (inst.containsKey(key)){
                if (inst.get(key) - value < 0 ){
                    System.out.println("we not hawe: " + Math.abs(inst.get(key) - value) + " instrument of " + key);
                    break;
                }
                    inst.replace(key, inst.get(key) - value);
                }else {
                System.out.println("did'nt find Instrument " + key);
            }
        }

        return inst;
    }

}
