//static method overload
class A{;
    static void show(String name){
        System.out.println("Hello "+name);
    }
    static int show(int age){
        return age;
    }
    static void show(String a,String b){
        System.out.println(a+" "+b);
    }
}
public class StaticKeyword3 {
    public static void main(String[] args) {
        A.show("Lokesh");
        System.out.println("Your Age is: "+A.show(22));
        A.show("Java", "Programming Language");
    }
}
