//multiple inheritance :method overloading 

class A{
    void method1(int a){
        System.out.println(a);
    }
    void method1(int a,int b){
        System.out.println(a+" "+b);
    }
}
class B{
    void show1(int a){
        System.out.println(a);
    }
    void show1(int a,int b){
        System.out.println(a+" "+b);
    }
}
class C extends A,B{
    void display(int a){
        System.out.println(a);
    }
    void display(int a,int b){
        System.out.println(a+" "+b);
    }
}
public class Methodoverloading5{
    public static void main(String[] args) {
       
   }
}
//Methodoverloading5.java:19: error: '{' expected
//class C extends A,B{
   //              ^
//1 error