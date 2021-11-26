package Warmup;

public class stringMatch {
/*
 appear in the "same place" in both strings
 */


    public static int stringMatch(String a, String b) {

//  전체
//        if(a.length() <2 || b.length()<2) return 0;
//
//        int ans = 0;
//
//        for(int i=0; i<a.length()-1;i++){
//            String str_a = a.substring(i,i+2);
//            for(int j=0;j<b.length()-1;j++){
//                String str_b = b.substring(j,j+2);
//                if(str_a.equals(str_b)){
//                    ans++;
//                    break;
//                }
//            }
//        }
//
//        return ans;

// 같은 포지션에 있는 것
        // Figure which string is shorter.
        int len = Math.min(a.length(), b.length());
        int ans = 0;

        // Look at both substrings starting at i
        for (int i=0; i<len-1; i++) {
            String aSub = a.substring(i, i+2);
            String bSub = b.substring(i, i+2);
            if (aSub.equals(bSub)) {  // Use .equals() with strings
                ans++;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        System.out.println(stringMatch("abbc", "bbbb"));
        System.out.println(stringMatch("abc", "abc"));
        System.out.println(stringMatch("abc", "axc"));
    }


}
