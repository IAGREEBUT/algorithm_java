package Warmup;

/*
stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"

C
Co
Cod
Code
= CCoCodCode


 */


public class stringSplosion {



    public static String stringSplosion(String str) {

        String ans ="";

        for(int i=0;i<=str.length();i++){
            ans+=str.substring(0,i);//시작 index, 끝 index
        }

        return ans;


    }

    public static void main(String[] args) {

        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

    }

}
