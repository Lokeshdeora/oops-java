 //in a class method name same but parameter also same but first in int and second method in byte then what happend ?
 class A{
    void disp(int a){
        System.out.println("int: "+a);
    }
    void disp(byte a){
        System.out.println("byte: "+a);
    }
}
public class Methodoverloading9 {
    public static void main(String[] args) {
        A obj = new A();
        obj.disp(10);
        obj.disp(3);
   }
}
