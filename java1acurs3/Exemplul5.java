public class Exemplul5{
    public static void main(String [] args){
        int [] x1;
        
        x1 = new int[5];  //5 este lungimea, nu mai poate fi schimbata
        
        x1[0] = 5; //0 --> zona pe care vreau sa o folosesc
        
      
        System.out.println(x1.length);
        System.out.println(x1[0]);
        System.out.println(x1[1]);
    }
}