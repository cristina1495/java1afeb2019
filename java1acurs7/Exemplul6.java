public class Exemplul6{
    public static void main(String [] args){
        Grup<Integer,String, Double>g1 = new Grup <Integer,String,Double>();
        
        Grup<Integer,String,Double>g2 = new Grup<>(); //nu mai punem tipurile generice
        
        Grup<?,?,?> g3 = new Grup<>(); //Object, Object, Object
        
        Grup<? extends Number,?,String> g4 = new Grup<>(); //Number, Object,String
        
        
    }
}