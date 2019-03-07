public class Exemplul8{
    
    public static void main(String [] args){
        int [][] a1 = new int [3][]; //array cu 2 dimensiuni
        
        a1[1] = new int[4];
        
        int [] b1 = new int [4];
        
        a1[0] = b1;
        a1[1] = b1;
        a1[2] = b1;
        
        b1[3] = 10;
        
        System.out.println(a1.length); //3
        System.out.println(a1[0]); //null  -- I@fa234f]
        System.out.println(a1[1]); //[I@fa234f]
        System.out.println(a1[1][3]); //10
        System.out.println(a1[0][3]); //10
    }
}