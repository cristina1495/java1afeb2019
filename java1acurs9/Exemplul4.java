import java.util.*;

public class Exemplul4{
    public static List<Integer> list = new ArrayList<>();
    
    public static void main (String [] args){
        
        new Producator().start();
        new Producator().start();
        new Producator().start();
        
        new Consumator().start();
        new Consumator().start();
        new Consumator().start();
    }
}