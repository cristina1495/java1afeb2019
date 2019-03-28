public class Exemplul8{
    public static void main(String [] args) {
        try{
        int x = 10/5; //daca pui 0 se blocheaza si apare doar Finally
        System.out.println(x);
    
        } finally{
        System.out.println("Finally!");
        }
    
    }
}