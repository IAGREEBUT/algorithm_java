package Warmup;

public class stringTimes {


    //문자열 붙이기 1. '+'
    public static String stringTimes(String str, int n) {

        String ans="";//선언을 해주어야 + 연산을 사용 가능 

        for(int i=0;i<n;i++){
            ans+=str;
        }
        return ans;

    }


    public static void main(String[] args) {

    }


}
