package Warmup;

public class stringTimes {


    //문자열 붙이기 1. '+' -> 문자열을 StringBuilder로 변환한 뒤, append사용 -> 다시 toString을 이용하여 String으로 변환
    // == append를 사용하는 방법 ( 여러개의 문자열을 붙일 떄 사용 )
    public static String stringTimes(String str, int n) {
        String ans="";//선언을 해주어야 + 연산을 사용 가능

        for(int i=0;i<n;i++){
            ans+=str;
        }

        return ans;
    }

    //문자열 붙이기 2. 'concat' -> 합친 문자열을 String으로 생성해줌
    // 2개의 문자열을 붙일 때 사용
    public static String stringTimes2(String str, int n) {
        String ans="";//선언을 해주어야 + 연산을 사용 가능

        for(int i=0;i<n;i++){
            ans = ans.concat(str);
        }

        return ans;
    }


    public static void main(String[] args) {

        String str = "Hi";

        System.out.println(stringTimes(str,2));
        System.out.println(stringTimes(str,3));
        System.out.println(stringTimes(str,4));


    }


}
