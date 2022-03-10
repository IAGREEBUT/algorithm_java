package String;

public class conCat {

    public static String conCat(String a, String b) {
        int a_len = a.length();
        int b_len = b.length();
        if(a_len==0 || b_len==0) return a+b;
        if(a.charAt(a_len-1)==b.charAt(0)) return a.substring(0,a_len)+b.substring(1,b_len);
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(conCat("abc",""));
    }
}
