public class Aggregation1 {
    
    public static void main(String[] args) {
        A1 a = new A1();
        a.show();
        a.show1(10);
        B1 b = new B1();
        b.show();
        System.out.println("return & argument in Class B1: "+b.show1(70));
    }
}
