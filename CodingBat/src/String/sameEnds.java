package String;

public class sameEnds {


    public static String sameEnds(String string) {

        String ans="";
        int size = string.length();

        if(size%2 ==0 ){ //길이가 짝수
            int left = 0, right = size/2;
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
//            System.out.println("짝수 인 경우\n");
//            System.out.println(cnt);
        }
        else{
            int left = 0, right = size/2 +1;
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
//            System.out.println("홀 수 인 경우\n");
//            System.out.println(cnt);
        }


//        for(int i=0; i<cnt; i++){
//            ans+=string.charAt(i);
//        }

        return ans;
    }

    public static void main(String[] args) {

        System.out.println(sameEnds("xxx"));


    }

}
