//single level inheritance : method overloading
class A{
    int show(int a){
        return a;
    }
    float show(float a){
        return a;
    } 
}
class B extends A{
    void display(int a,int b){
        System.out.println(a+" "+b);
    }
    void display(float a,float b){
        System.out.println(a+" "+b);
    } 
}
public class Methodoverloading4 {
    public static void main(String[] args) {
        B ob = new B();
        System.out.println(ob.show(10));
        System.out.println(ob.show(32.6f));
        ob.display(4, 5);
        ob.display(2.3f, 7.5f);
   }
}
