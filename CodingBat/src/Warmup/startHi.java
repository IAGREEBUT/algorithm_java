package Warmup;

public class startHi {


    public static boolean startHi(String str) {

        if(str.length()<2) return false;

        return (str.substring(0,2).equals("hi"));


    }

    public static void main(String[] args) {

        System.out.println(startHi("hi there"));
        System.out.println(startHi("hello there"));
        System.out.println(startHi("h"));
    }
}
