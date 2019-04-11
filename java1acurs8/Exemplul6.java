import java.util.*;
public class Exemplul6{
    public static void main(String [] args) {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(1, "A");
        map.put(1234, "B");
        map.put(6, "C");
        map.put(10, "D");
        map.put(157, "A");
        map.put(10, "Q");
        
        System.out.println(map);
        
        Set<Integer> keys = map.keySet();
        for (Integer k : keys){
            System.out.println(k+ " " + map.get(k));
        }
        //sau incepand cu java8 se foloseste:
        map.forEach((k,v) -> System.out.println(k+ " " + v));
    }
}