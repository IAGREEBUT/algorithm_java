package String;

public class withouEnd2 {

    public static String withouEnd2(String str) {
        if(str.length()<2) return "";

        return str.substring(1,str.length()-1);//시작인덱스, 마지막인덱스 + 1
    }

    public static void main(String[] args) {
        System.out.println(withouEnd2("hello"));
    }

}
