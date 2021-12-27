package String;

public class extraEnd {

    public static String extraEnd(String str) {

        String ans = str.substring(str.length()-2,str.length());

        return ans+ans+ans;


    }


    public static void main(String[] args) {

        System.out.println(extraEnd("HELO"));


    }

}
