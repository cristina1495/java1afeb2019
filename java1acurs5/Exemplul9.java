public class Exemplul9{
    public static void main(String [] args){
        int a = 2; 
        
        Predicat p1 = x -> x % a ==0;
        
        Predicat p2 = x -> {
            return x % 2 ==0;
        };
    }
}