public class Exemplul16{
    public static void main( String [] args){
        //m1(); //pimul afiseaza 0; al doilea BOOM!!
        //m1(1); //1 ; 1
        //m1(2,3,4,5,6,7,8); // 7; 2
        
        //m2(10, 20);
        
        int [] x = {1,2,3,4,5};
        m1(x);
    }
    
    static void m1(int...x){
        System.out.println(x.length);
        System.out.println(x[0]);
    }
    
    static void m2(int y, int...x){
        System.out.println(x.length);
    }
    
    static void m3(int[]...x){
    
    }
}