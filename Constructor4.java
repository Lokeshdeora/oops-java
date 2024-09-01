class A{
    A(int a,int b){
        System.out.println(a+" "+b);
    }
    A(int a,int b,int c){
        System.out.println(a+" "+b+" "+c);
    }
}
public class Constructor4 {
    public static void main(String[] args) {
        new A(40, 2);
        new A(20,40,40);
    }
}
