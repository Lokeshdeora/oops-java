//constructor chaining :

//A() :1--->2 
//A() :2---->4
//A() :3-->1
//A() :4---->6
//A() :5---->10
//A() :6
//A() :7----->9
//A() :8---->3
//A() :9--->8
//A() :10---->7
class A{
    A(){
        this(7);
        System.out.println("Default Constructor");
    }
    A(int a){
        this('H');
        System.out.println("Constructor2: "+a);
    }
    A(float a){
        this();
        System.out.println(a);
    }
    A(char a){
        this(60.7);
        System.out.println(a);
    }
    A(String a){
        this(2,3,4);
        System.out.println(a);
    }
    A(double a){
        System.out.println(a);
    }
    A(int a,int b){
        this("Hello","World!");
        System.out.println(a+b);
    }
    A(float a,float b){
        this(7.9f);
        System.out.println(a+" "+b);
    }
    A(String a,String b){
        this(8.5f,7.5f);
        System.out.println(a+" "+b);
    }
    A(int a,int b,int c){
        this(50,55);
        System.out.println(a+" "+b+" "+c);
    }
}
public class Constructor10{
    public static void main(String[] args) {
        new A("Java");        
    }
}