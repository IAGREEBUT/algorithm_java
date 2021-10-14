package String;

public class sameEnds {


    public static String sameEnds1(String string) {

        String ans="";
        int size = string.length();
        int left = 0, right = size/2;
        if(size%2==1){
            right++;
        }

        //투포인터 탐색
        while(left<size/2 && right<size){

            if(string.charAt(left)!=string.charAt(right)){
                right++;
            }
            else {
                ans+=string.charAt(left);
                left++;
                right++;
            }

        }

        return ans;
    }



    public static String sameEnds2(String string){

        int len = string.length();
        String ans = "";
        String tmp = "";

        for(int i=0; i<len; i++){
            tmp += string.charAt(i);
            int tmplen = tmp.length();
            if( i<len/2 && tmp.equals(string.substring(len-tmplen,len)))
                ans = tmp;
        }
        return ans;

    }

    public static void main(String[] args) {

        System.out.println(sameEnds1("abxyab"));
        System.out.println(sameEnds2("xxx"));


    }

}
