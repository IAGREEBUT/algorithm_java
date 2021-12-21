package Warmup;

public class frontBack {


    public static String frontBack(String str) {

        int len = str.length();

        if(len<=1) return str;

        //string swap (string builder setCharAt 이용)
        StringBuilder ans = new StringBuilder(str);
        ans.setCharAt(0, str.charAt(len-1));
        ans.setCharAt(len-1, str.charAt(0));

        return ans.toString();

    }


    public static String frontBack2(String str) {

        int len = str.length();

        if(len<=1) return str;

        char ans[] = str.toCharArray();

        char tmp = ans[0];
        ans[0] = ans[len-1];
        ans[len-1] = tmp;

        return String.valueOf(ans);//char array to string

    }

    public String frontBack3(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }


    public static void main(String[] args) {

        System.out.println(frontBack("code"));

    }

}
