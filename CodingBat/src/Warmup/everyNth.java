package Warmup;

public class everyNth {

    public static String everyNth(String str, int n) {

        String ans="";

        for(int i=0;i<str.length();i+=n){
            ans+=str.substring(i,i+1);
        }

        return ans;
    }


    public static String everyNth_sol(String str, int n) {
        String result = "";
        
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("helloTHERE",3));
    }

}
