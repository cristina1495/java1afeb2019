import java.util.*;

public class Exemplul3{
    public static void main(String [] args){
        Set<Integer>set = new TreeSet<>();
        
        set.add(100);
        set.add(12);
        set.add(234);
        set.add(567);
        set.add(1100);
        set.add(12);
        //for(Integer x:set){
        //    System.out.println(x);
        //}
        
        set.forEach(x-> System.out.println(x)); //incepand cu java8 se poate folosi
        //sau set.forEach(System.out::println);
    }
}