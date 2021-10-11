package Warmup;

import java.util.Scanner;

public class missingChar {

    // String Builder이용 
    public static String missingChar1(String str, int n) {

        StringBuilder str2 = new StringBuilder(str);
        str2 = str2.deleteCharAt(n);

        return str2.toString();
    }

    //substring 이용
    public static String missingChar2(String str, int n) {

        str = str.substring(0,n)+str.substring(n+1);

        return str;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int n = input.nextInt();

        System.out.println(missingChar1(str,n));
        System.out.println(missingChar2(str,n));


    }
}
