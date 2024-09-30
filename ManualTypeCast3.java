//int -> char
//int -> short
//int -> byte

public class ManualTypeCast3 {
    public static void main(String[] args) {
        int a = 150;
        short b = (short)a;
        byte c = (byte)a;
        System.out.println("int: "+a+"\nshort: "+b+"\nbyte: "+c);
    }
}