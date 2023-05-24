public class chain {
    public void asking() {
        System.out.println("hearing");
    }

    public void ask() {
        System.out.println("here");
    }
 
    public void asked() {
        System.out.println("hered");
    }

    public static void main(String args[]){
        chain c = new chain();
        c.asking().ask().asked();
    }
}
