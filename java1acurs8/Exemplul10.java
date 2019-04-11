import java.util.*;

public class Exemplul10{
    public static void main (String [] args){
        List<Integer> list = Arrays.asList(1,3,4,5,6,7,8);
        
        list.stream() //sursa
            .filter(x -> x % 2 ==0) //trec mai departe doar cele care returneaza true
            .forEach(System.out::println); //operatia terminala
    }
}