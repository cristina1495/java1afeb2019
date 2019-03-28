public class Exemplul2 {
    public static void main(String[] args){
        String s1 = "Hello"; //nu se modifica s1, se creaza o alta valoare
        //s1 = s1 + "World!"; String este imutable
        String s2 = "Hello"; //=new String("Hello"); dadea false
        String s3 = "";
        String s4 = s1 + s3;
        
        for(int i=0;i<100;i++){
            s1 = s1 + i; //101 valori
        }
        boolean b1 = s1 ==s2; //true 
    }
}