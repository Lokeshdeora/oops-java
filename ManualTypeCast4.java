//char -> short
//char -> byte

public class ManualTypeCast4 {
    public static void main(String[] args) {
       char a = 'R';
       short b = (short)a;
       byte c = (byte)a;
       System.out.println("char: "+a+"\nshort: "+b+"\nbyte: "+c);
    }
}