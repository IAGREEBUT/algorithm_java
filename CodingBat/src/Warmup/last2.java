package Warmup;

/*

str에서 마지막 2글자가 문장 전체에 몇번 나오나?
axxxaaxx

xx 와 동일한게 몇개?
-ax
-xx
-xx
-xa
-aa
-ax
=> 2개

 */

public class last2 {

    public static int last2(String str) {

        int len = str.length();

        if(len<2) return 0;

        String last = str.substring(len-2,len);//마지막 2글자

        int ans=0;

        for(int i=0;i<len-2;i++){
            String tmp = str.substring(i,i+2);
            if(tmp.equals(last)) ans++; //마지막 2글자와 같다면
        }

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));

    }




}
