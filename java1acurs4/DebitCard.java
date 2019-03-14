public class DebitCard extends Card{
    
    @Override//s.n. adnotare
    public void retragere(double suma) {
        if (this.sold>=suma) {
            this.sold -=suma;
        }
    }
}