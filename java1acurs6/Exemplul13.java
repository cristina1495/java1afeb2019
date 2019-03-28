public class Exemplul13{
    public static void main(String [] args){
        Door d = new Door();
        try{
            //use the door
        }catch (Exception e){
        
        }finally{
            d.close();
        }
    }
}

/*public static void main(String[]args)
 * Door d1 = new Door();
 * Door d2 = new Door(); se inchide mai intai d2 si apoi d1
 * //use the door
 * }catch (Exception e){
 * }
 * } se afiseaza Closing... de 2 ori
 * acelasi lucru cu cel de sus doar ca mai scurt
*/

