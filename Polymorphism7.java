//parent class method and //child class method name different then make object of parent class then does not access child class property 
class A{
    void show(){
        System.out.println("Parent Class Method");
    }
}
class B extends A{
    void show1(){
        System.out.println("Child Class Method");
    }
}
public class Polymorphism7{
    public static void main(String[] args) {
        A obj = new B();
        obj.show1();
        obj.show();
    }
}
//Ans--> error because obj is not B class object so does not 
 //access child class property throgh constructor*/