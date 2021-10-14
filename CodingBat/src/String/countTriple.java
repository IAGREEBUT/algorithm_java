package String;

public class countTriple {


    public static int countTriple(String str) {

        char n;
        char p='\0';

        int cnt = 1;
        int ans = 0;

        for(int i=0; i<str.length(); i++){

            n = str.charAt(i);
            if(p==n) {
                cnt++;
                if(cnt>=3){
                    ans++;
                }
            }
            else{
                cnt=1;
            }
            //갱신
            p = n;

        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(countTriple("xxxyzzzz"));

    }


}
