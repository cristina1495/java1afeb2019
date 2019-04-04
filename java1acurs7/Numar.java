public class Numar<N> {
    
    private N valoare;
    
    public Numar(N valoare){
        this.valoare = valoare;
    }
    
    public N m(N n){
        return n;
    }
    
    static <A> A w1 (A n) {
        return n;
    }
    
    static Object w2(Object n){
        return n;
    }
}