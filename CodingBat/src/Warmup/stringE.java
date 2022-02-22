package Warmup;

public class stringE {


    public static boolean stringE(String str) {
        int cnt=0;
        for(int i=0;i<str.length();i++){
            if(str.substring(i,i+1).equals("e")) cnt++;
        }

        if(cnt<4&&cnt>0) return true;
        return false;

    }


    public static boolean stringE_sol(String str) {
        int count = 0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }


    public static void main(String[] args) {
        System.out.println(stringE("hello"));
    }
}
