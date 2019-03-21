public class Exemplul11{
    public static void main(String [] args){
        Cat c1 = new Cat("Tom");
        Cat c2 = c1;
        Cat c3 = new Cat("Tom");
        
        boolean b1 = c1 == c2; //true
        boolean b2 = c1 == c3; //false, pt ca sa creaza o noua pisica
        System.out.println(b2);
        
        String x = "hello";
        String y = "hello"; //new String("hello") da false
        
        boolean b3 = x ==y; //true
        System.out.println(b3);
        
        boolean b4 = x.equals(y);
    }
}