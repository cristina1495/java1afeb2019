public class Exemplul3{
    public static void main(String [] args){
        String s1 = "Hello";
        
        char c1 = s1.charAt(0);//'H' accesam un caracter aflat pe o anumita pozitie
        int i1 = s1.length(); //5
        boolean b1 = s1.equals("Hello"); //true
        boolean b2 = s1.equalsIgnoreCase("HELLO"); //true - nu conteaza ca are litere mici sau mari
        int i2 = s1.compareTo("World");//daca s1> decat parametrul se retuneaza 
        int i3 = s1. compareToIgnoreCase("World");
        String s2 = s1.substring(3); //lo  - preluam un subsir dintr-un sir
        String s3 = s1.substring(1,4); // ell
        int i4 = s1.indexOf("llo"); //2 pozitia pe care se gaseste subsirul in sir
        boolean b3 = s1.contains("a"); //false - arata daca un subsir se afla intr-un sir
        boolean b4 = s1.startsWith("A"); //false
        boolean b5 = s1.endsWith("lo"); //true
        boolean b6 = s1.isEmpty();//false - este echivalent cu s1.length == 0
        String s4 = s1.replace('e', 'a'); //Hallo inlocuieste caracterul cu cel dat
        String s5 = s1.concat("World"); //HelloWorld
        String s6 = s1.toLowerCase(); //hello
        String s7 = s1.toUpperCase(); //HELLO
        String s8 ="   aaa aa   ccc  "trim(); // "aaa aa   ccc" elimina spatiile de la inceput si final
    }
}