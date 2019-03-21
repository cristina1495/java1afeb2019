public class Cerc extends Forma{
    int nume;
    double raza;
    
    public Cerc (double raza){
        super("Cerc");
        this.raza = raza;
        
        super.nume="Altceva";//duce la stringul din forma
        this.nume=10;//duce la int-ul de sus
    }
    
    public double arie(){
        return 3.14 * raza *raza;
    }
}