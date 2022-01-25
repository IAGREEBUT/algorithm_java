package String;

public class theEnd {

    public static String theEnd(String str, boolean front) {
        if(front) return str.substring(0,1);
        return str.substring(str.length()-1);
    }


    public static void main(String[] args) {
        System.out.println(theEnd("hello",true));
        System.out.println(theEnd("hello",false));
    }
}
