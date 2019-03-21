public class Exemplul6 {

    public static void main (String [] args){
        Foo f1= new Foo();
        f1.m();
        
        Foo f2 = new Foo(){
        
            void m() {
                System.out.println("Bar!");
            }
        }; //clasa anonima, o mosteneste pe cea pt care se creaza
        
        f2.m();//Bar!
    }


}