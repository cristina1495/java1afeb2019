public class Exemplul7 {
    public static void main (String [] args){
        a(-10);
    }
    
    public static void a(int x){
        if (x<0) {
            throw new MyRunTimeException();
        }
        System.out.println("x:" + x);
    }
}