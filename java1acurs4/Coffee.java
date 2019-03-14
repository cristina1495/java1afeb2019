public enum Coffee{
    SMALL(10), MEDIUM(50), BIG; //primele 2 instante acceseaza al 2-lea constructor
    private int qty;
    
    Coffee(){ //nu poti pune public, e automat privat
    }
    
    Coffee(int qty){
        this.qty = qty;
    }
    
    public void drink(){
        this.qty--;
    }
}