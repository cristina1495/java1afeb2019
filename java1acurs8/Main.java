import java.util.*;

public class Main{
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        while(true){
            System.out.println("Comanda:");
            String cmd = s.nextLine();
            
            String [] cuv = cmd.split("\\s+"); //baga cuvintele intr-un vector in functie de spatii
            
            switch(cuv[0]){
                case "exit":
                    System.out.println("Bye bye..");
                    return; //nu merge break pt ca te scoate doar din switch nu si din while
                case "ab":
                    adaugaBere(cuv);
                    break;
                case "ac":
                    adaugaCiocolata(cuv);
                    break;
                case "afisare":
                    Magazin.getInstance().afisareProduse();
                    break;
                case "cioco":
                    Magazin.getInstance().afisareCiocolate();
                    break;
                default:
                    System.out.println("Comanda gresita!");
            }
        }
    }
    
   private static void adaugaBere(String [] cuv){
       String serie = cuv[1];
       double pret = Double.parseDouble(cuv[2]);
       double pa = Double.parseDouble(cuv[3]);
       Bere b = new Bere(serie, pret, pa);
       Magazin.getInstance().adaugaProdus(b);
       System.out.println("O noua bere a fost adaugata!");
   }
   
   private static void adaugaCiocolata(String [] cuv){
       String serie = cuv[1];
       double pret = Double.parseDouble(cuv[2]);
       int kCal = Integer.parseInt(cuv[3]);
       Ciocolata c = new Ciocolata(serie, pret, kCal);
       Magazin.getInstance().adaugaProdus(c);
       System.out.println("O noua ciocolata a fost adaugata!");
   }
}