package Warmup;

import java.util.Scanner;

public class countXX {

    public static int countXX(String str){
        int cnt = 0;

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx"))
                cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(countXX(str));
        System.out.println(countXX(str));


    }



}
