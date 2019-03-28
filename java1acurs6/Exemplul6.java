public  class Exemplul6 {

    public static void main(String [] args) {
        Integer i1 = new Integer(10); //java9 ->deprecated
        Integer i2 = 10; //boxing
        int x = i2; //unboxing
        
        int a = Integer.parseInt("123");
        long b = Long.parseLong("123");
        double c = Double.parseDouble("10.5");
        
    }
    
    static void m(int x) {
    }
    
    static void m(Integer x) {
    }
}