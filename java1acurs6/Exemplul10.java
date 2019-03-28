public class Exemplul10{
    public static void main(String [] args){
        try{
            int x = 10/5; // pentru 0 nu se blocheaza si se afiseaza bau
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Bau!");
        }
    }
}