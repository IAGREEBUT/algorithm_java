package String;

public class lastTwo {

    public static String lastTwo(String str) {
        int len = str.length();
        if(len<2) return str;
        return str.substring(0,len-2)+str.charAt(len-1)+str.charAt(len-2);
    }


    public static void main(String[] args) {
        System.out.println(lastTwo("hello"));
    }
}
