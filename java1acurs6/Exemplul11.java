public class Exemplul11{
    public static void main(String [] args){
        try{
            int x = 10/0;
            System.out.println(x);
        } catch (ArithmeticException e) { //mai particular
            System.out.println("Bau1"); 
        } catch (Exception e) {  //mai general
            System.out.println("Bau2"); 
        }
        
    }
}