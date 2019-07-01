package Ilearn;

public class Abcd {

    public static int id = 1000;

    public Abcd() {
        id--;
    }

    public static void main(String[] args) {
        Abcd obj = new Abcd();
        System.out.println(Abcd.id);
        Abcd obj2 = new Abcd();
        System.out.println(Abcd.id);
        Abcd obj3 = new Abcd();
        System.out.println(Abcd.id);
        Abcd obj4 = new Abcd();
        System.out.println(Abcd.id);

        StringBuffer stringBuffer= new StringBuffer("Nobin ");
        String name = "Nobin";
        stringBuffer.append("Kalayil");
        System.out.println(stringBuffer);
        char ch = name.charAt(2);
        System.out.println(ch);
        int len= name.length();
        System.out.println(len);


    }
}
