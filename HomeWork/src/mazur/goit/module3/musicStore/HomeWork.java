package mazur.goit.module3.musicStore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) throws IOException {
        // create and add 3 elements of the shopInstruments to the mapList
        Map<String, Integer> shopInstruments = new HashMap<String, Integer>();
        shopInstruments.put("piano", 2);
        shopInstruments.put("truba", 17);
        shopInstruments.put("guitar", 6);
        // read Instrument name and value of the new buyList
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> buyInstrumentList = new HashMap<String, Integer>();
        try {
        addElementMap(shopInstruments);
        String instrName = reader.readLine();
        int instrVal = Integer.parseInt(reader.readLine());

        buyInstrumentList.put(instrName, instrVal);
        //buy Musical Instrument in the list buyInstrumentList
        System.out.println();
        getMap(buyInstr(shopInstruments, buyInstrumentList));


        }
        catch (NumberFormatException ex){
            System.out.println("pleas write a value of the by instrumetn " );
        }
        catch (IllegalCharsetNameException ex){
            System.out.println("writeln tex pls");
        }
        catch (Exception e) {
            System.out.println("RRREEEPPSS");
        }
    }

    // method for buy  MusicalShop Instruments
    //_________________________________________________________________________________________________________________
    public static Map<String, Integer> buyInstr(Map<String, Integer> map1, Map<String, Integer> map2) {
        String tempKeyMap1 = null;
        int tempValMap1 = 0;
        String tempKeyMap2 = null;
        int tempValMap2 = 0;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            tempKeyMap1 = entry.getKey();
            tempValMap1 = entry.getValue();
            try {
                for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
                tempKeyMap2 = entry2.getKey();
                tempValMap2 = entry2.getValue();
                if (tempKeyMap1.equals(tempKeyMap2)) {
                    if (tempValMap2 <= 0 || tempValMap1 < tempValMap2) {
                        System.out.println("EROR value <= 0 or we did'n have " + tempValMap2 + " instrumets" +
                                "\nwe have " + tempKeyMap2 + " : " + tempValMap1);
                        break;
                    }
                    map1.containsKey(tempKeyMap2);
                    map1.replace(tempKeyMap2, tempValMap1 - tempValMap2);
                }
            }
            } catch (NumberFormatException ex){
                System.out.println("We not have " + tempKeyMap2 + " in the musical shop");
            }
        }
        return map1;
    }

    public static void getMap(Map<String, Integer> map) {
        map.forEach((k, v) ->
                System.out.println(k + " : " + v));
    }

    // methods to add new Instruments or replace new Value of the instument on the mapList
    public static Map<String, Integer> addElementMap(Map<String, Integer> map) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write a name of the musical Instrument");
        String instrName = reader.readLine();
        System.out.println("Write a value of the musical Instrument");
        int instrVal = Integer.parseInt(reader.readLine());
        map.put(instrName, instrVal);
        if (map.containsKey(instrName)){
            map.replace(instrName, map.get(instrName) + instrVal);
        }
        return map;
    }
}
