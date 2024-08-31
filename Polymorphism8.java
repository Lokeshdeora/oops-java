//parent class method and child class method name same then make object of parent class then print child class property  due to method overriding 

    class A{
        void show(){
            System.out.println("Parent Class Method");
        }
    }
    class B extends A{
        void show(){
            super.show();
            System.out.println("Child Class Method");
        }
    }
    public class Polymorphism8 {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
