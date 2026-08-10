package academy.marcoscaretaker.maratonajava.javacore.Ycollections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("A","Letter A");
        map.put("M","Letter M");
        map.put("Ç","Letter Ç");
        map.put("T","Letter T");
        map.put("J","Letter J");
        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getKey());
        }
        System.out.println(map.headMap("M",true));
        System.out.println(map.ceilingKey("M"));
        System.out.println(map.higherKey("M"));
    }
}
