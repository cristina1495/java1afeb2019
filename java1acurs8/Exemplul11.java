import java.util.*;

public class Exemplul11{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(2,3,4,5,6,7);
        
        int sum=
            list.stream() //sursa
                .filter(x -> x%2 !=0) //filtreaza nr impare
                .reduce(0,(a,b) -> a+b); //valorile impare sunt adunate
                
        System.out.println(sum);
    }
}