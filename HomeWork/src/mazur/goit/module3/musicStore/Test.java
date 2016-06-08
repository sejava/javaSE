package mazur.goit.module3.musicStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by pan on 08.06.16.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Instrument guitar1 = new Instrument();
        Guitar guitar2 = new Guitar();
        guitar1.example();
        guitar2.example();
/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> instKup = new HashMap<String, Integer>();
        System.out.println("Searc: \n pleas writ Instrument name");
        String instrum = reader.readLine();

        System.out.println("pleas write instrument val");

        Integer val = Integer.parseInt(reader.readLine());
        instKup.put(instrum, val);




        Map<String, Integer> inst = new HashMap<String, Integer>();
        inst.put("piano", 2);
        inst.put("guitar", 16);
        inst.put("trumpet", 7);
        //store.prepareInstruments(Map<>);
        Iterator<Map.Entry<String, Integer>> iterator = inst.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println(key + ":" + value);
        }

*/




    }


}
