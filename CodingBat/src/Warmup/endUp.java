package Warmup;

import java.util.Locale;

public class endUp {



    public static String endUp(String str) {

        int len = str.length();

        if(len<3) return str.toUpperCase();

        String tmp = str.substring(len-3, len);
        return str.substring(0,len-3) + tmp.toUpperCase();


    }



    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
    }


}
