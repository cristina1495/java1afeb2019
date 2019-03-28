public class Exemplul12{
    public static void main(String [] args){
        try{
            int x = 10/0;
            System.out.println(x);
        } catch (NullPointerException | ArithmeticException e) { //multicatch - cele 2 exceptii trebuie sa fie independente
            System.out.println("Bau!");  
        } finally{
            System.out.println("Finally");
        }
    }
}