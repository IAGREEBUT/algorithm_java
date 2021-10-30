package Warmup;

public class stringX {


    public static String stringX(String str){


        int len = str.length();

        if(len<=2) return str;


        String ans = Character.toString(str.charAt(0));

        for(int i=1;i<len-1; i++){
            if(str.charAt(i) != 'x') ans+=str.charAt(i);
        }

        ans += str.charAt(len-1);

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abcd"));
        System.out.println(stringX("xabcdx"));

    }
}
