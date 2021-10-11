package String;

import java.util.Scanner;

public class gHappy {

    public static boolean gHappy(String str) {
        boolean gState= true;
        boolean flag = false;//이전이 g인가

        for(int i=0; i<str.length();i++ ){
            if( str.charAt(i) =='g'){
                gState = false;
                if(flag){
                    gState=true;
                }
                flag = true;
            }
            else{
                flag = false;
            }
        }
        return gState;
    }




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(gHappy(str));

    }



}
