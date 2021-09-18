import java.util.HashMap;

public class PracticeBlock3Task1 {


    static HashMap<String, Integer> millionsRounding(HashMap<String, Integer> map) {
        for (String element : map.keySet()) {
            int i = map.get(element);
            i = (int) Math.round((double) i / 1000000.0) * 1000000;
            map.put(element, i);
        }
        return map;
    }


    public static void main(String[] args) {
        HashMap<String, Integer> hashTable = new HashMap<>();
        hashTable.put("Nice", 942208);
        hashTable.put("Abu Dhabi", 1482816);
        hashTable.put("Naples", 2186853);
        hashTable.put("Vatican City", 572);
        System.out.println(millionsRounding(hashTable));
    }
}