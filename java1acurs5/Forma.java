public abstract class Forma{
    
    protected String nume;
    
    
    public Forma(){
        System.out.println("S-a apelat constructorul Forma");
    }
    
    public Forma(String nume){
        this.nume=nume;
        
    }
    
    public abstract double arie();
    
}