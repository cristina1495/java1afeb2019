import java.util.*;
public class Exemplul8{
    public static void main(String [] args) {
        Map<Integer, String> map = new TreeMap<>();
        
        map.put(1, "A");
        map.put(1234, "B");
        map.put(6, "C");
        map.put(10, "D");
        map.put(157, "A");
        map.put(10, "Q");
       
        map.forEach((k,v) -> System.out.println(k+ " " + v));
    }
}