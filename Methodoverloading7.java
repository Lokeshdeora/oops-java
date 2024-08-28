//in a class method name same but number of parameter also same but return type of method will be change
class A{
    int add(int x,int y){
        return x+y;
    }
    float add(float x,float y){
        return x+y;
    }
}
public class Methodoverloading7 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.add(50, 40));
        System.out.println(a.add(4.5f, 10.3f)); 
   }
}
