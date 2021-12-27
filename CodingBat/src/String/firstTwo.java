package String;

public class firstTwo {


    public static String firstTwo(String str) {

        int len = str.length();

        if(len<2) return str;

        return str.substring(0,2);

    }



    public static void main(String[] args) {

        System.out.println(firstTwo("a"));
        System.out.println(firstTwo("HELOO"));
    }
}
