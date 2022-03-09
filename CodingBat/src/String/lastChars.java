package String;

public class lastChars {

    public static String lastChars(String a, String b) {
        String ans = "";
        if(a.length()==0) ans+="@";
        else ans+=a.substring(0,1);

        if(b.length()==0) ans+="@";
        else ans+=b.substring(b.length()-1,b.length());

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(lastChars("hello",""));
    }

}
