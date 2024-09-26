//outer class  non static and inner class static and method  non static and instance variable non static 
class A{
    static class B{
        String s = "Hello ! Static";
        public String printString(){
            return s;
        }
    }
}
public class Static6 {
    public static void main(String[] args) {
        A.B a = new A.B();
        System.out.println(a.printString());
    } 
}
