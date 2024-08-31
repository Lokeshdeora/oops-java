class A{
    A(int a,int b){
        System.out.println(a+" "+b);
    }
    A(int a,int b,int c){
        System.out.println(a+" "+b+" "+c);
    }
}
public class Polymorphism4 {
    public static void main(String[] args) {
        new A(30, 3);
        new A(20,30,40);
    }
}
