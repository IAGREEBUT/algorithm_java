package String;

public class atFirst {

    public static String atFirst(String str) {
        if(str.length()==0) return "@@";
        if(str.length()<2) return str+"@";
        return str.substring(0,2);

    }


    public static void main(String[] args) {
        System.out.println(atFirst(""));
        System.out.println(atFirst("abc"));
    }
}
