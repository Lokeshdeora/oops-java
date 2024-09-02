//abstract class :
//	no return and no argument : abstract method 
//	no return and  argument :non abstract method
//	 return and no argument : abstract method
//	 return and  argument :non abstract method
//
//class B extends abstract class 


//class Main 
//access
abstract class A{
    A(String name){
        System.out.println("Name: "+name);  
    }
    abstract int add();
    abstract int sub(int a,int b);
}
class B extends A{
    B(){
        super("Lokesh");
    }
    int add(){
        int a = 20,b=20;
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
}
public class Abstract{
    public static void main(String[] args){
        B obj= new B();
        System.out.println("Add: "+obj.add());
        System.out.println("Sub: "+obj.sub(60, 40));

    }
}