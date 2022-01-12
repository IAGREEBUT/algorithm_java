package String;

public class comboString {


    public static String comboString(String a, String b) {

        if(a.length()>b.length()) return b+a+b;
        return a+b+a;


    }


    public static void main(String[] args) {
        System.out.println(comboString("hi", "hello"));
        System.out.println(comboString("superman","batman"));
    }
}
