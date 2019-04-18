import java.util.Random;

public class Producator extends Thread{
    
    public void run(){
        try{
          while (true) {
           synchronized(Exemplul4.list){
             if(Exemplul4.list.size()<100){
              int x = new Random().nextInt(1000);
              Exemplul4.list.add(x);
              System.out.println("Producatorul a adaugat valoarea " + x);
             } else {
                Exemplul4.list.wait();
             }
            }
          }
        }catch(Exception e){
        System.out.println("Ooops");
       }
    }
}