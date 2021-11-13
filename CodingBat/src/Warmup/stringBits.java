package Warmup;

public class stringBits {

    public static String stringBits(String str){

        String ans="";

        for(int i=0;i<str.length();i++){

            if(i%2==0) ans+= str.substring(i,i+1); //str[i]; 이게 자바에서는 안된다.

        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println(stringBits("Hello"));

    }
}
