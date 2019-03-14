public class Exemplul6{
        public static void main (String [] args) {
            Card c = new DebitCard();
            c.sold = 1000;
            
            c.retragere(1100);
            
            System.out.println(c.sold); //se afiseaza 1000 pt ca nu poti retrage mai mult decat ai
        }
}