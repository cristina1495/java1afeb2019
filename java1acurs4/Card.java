public class Card{
    protected double sold;
    
    public void depunere(double suma){
        this.sold +=suma;
        
    }
    public void retragere(double suma){
        this.sold -=suma;
    }
}