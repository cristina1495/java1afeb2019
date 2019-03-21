public class Exemplul1{
    public static void main (String [] args) {
        Matematician m = new Matematician();
        
        Cerc c = new Cerc (10);
        Dreptunghi d = new Dreptunghi(10,5);
        
        m.afiseazaArie(c);
        m.afiseazaArie(d);
    }
}