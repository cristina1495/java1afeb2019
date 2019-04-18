public class Consumator extends Thread{
    @Override
    public void run(){
        try{
        while(true){
          synchronized(Exemplul4.list){
            if (Exemplul4.list.size()>0){
                int x = Exemplul4.list.get(0);
                Exemplul4.list.remove(0);
                Exemplul4.list.notifyAll();
                System.out.println("Consumatorul a eliminat valoarea "+x);
            }else{
                Exemplul4.list.wait();
            }
          }
        }
      }catch(Exception e){
        System.out.println("Ooops");
      }
    }
}