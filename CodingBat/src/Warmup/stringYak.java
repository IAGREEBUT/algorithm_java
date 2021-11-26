package Warmup;

public class stringYak {

    //java에서 부분 문자열 제거
    //https://www.delftstack.com/ko/howto/java/how-to-remove-a-substring-from-string-in-java/

    //yak을 제거
    public static String stringYak(String str){

        String ans = str.replaceAll("yak","");
        return ans;
    }


    //sample solution
    //y로 시작하고 k로 끝나는 3자.. a아니어도 된다고함;
    public static String stringYak2(String str) {
        String result = "";

        for (int i=0; i<str.length(); i++) {
            // Look for i starting a "yak" -- advance i in that case
            if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
                i =  i + 2;
            } else { // Otherwise do the normal append
                result = result + str.charAt(i);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(stringYak2("ybkpak"));

    }


}
