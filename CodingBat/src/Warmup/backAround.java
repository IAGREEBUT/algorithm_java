package Warmup;

public class backAround {

    public static String backAround(String str) {
        return str.substring(str.length()-1)+ str + str.substring(str.length()-1);
    }



    public static void main(String[] args) {
        System.out.println(backAround("cat"));
    }
}
