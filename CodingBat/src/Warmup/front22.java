package Warmup;

import java.util.Scanner;

public class front22 {

    public static String front221(String str) {

        if(str.length()>=2){
            String front = str.substring(0,2);

            return front + str + front;
        }
        else{
            return str+str+str;
        }

    }


    // substring이용
    public static String front222(String str) {

        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(front221(str));
        System.out.println(front222(str));


    }

}
