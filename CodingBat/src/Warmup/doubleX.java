package Warmup;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
string에서 최초로 나온 x가 단독 x가 아니어야 한다.
 */

public class doubleX {


    static boolean doubleX(String str) {

        int i = str.indexOf("x"); //최초의 x의 index
        if (i == -1) return false; // string 내에 x가 존재하지 않음


        if (i+1 >= str.length()) return false; // 범위를 넘어가지 않는지
        return str.substring(i+1, i+2).equals("x");//최초의 x뒤에 x가 나오는지

    }


    public static void main(String[] args) {

        System.out.println(doubleX("xxax")); //true
        System.out.println(doubleX("xaxx")); //false
        System.out.println(doubleX("abc")); //false


    }

}
