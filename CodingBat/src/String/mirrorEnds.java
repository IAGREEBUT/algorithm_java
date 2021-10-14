package String;

public class mirrorEnds {

    public static String mirrorEnds(String string) {

        int len = string.length();
        String ans = "";
        String tmp = "";

        for(int i=0; i<len; i++){
            tmp += string.charAt(i);//처음부터 한자씩 저장
            int tmplen = tmp.length();//길이를 저장

            StringBuffer sb = new StringBuffer(tmp);
            String reversedStr = sb.reverse().toString();

            if( i<len && reversedStr.equals(string.substring(len-tmplen,len))) //역순서이므로 전범위를 검사해야함
                ans = tmp;//끝부터 길이 만큼의 substring의 역순과 같은지 검사
        }
        return ans;
    }

    public static void main (String[]args){

        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
        System.out.println(mirrorEnds("abab"));
        System.out.println(mirrorEnds("xxx"));
        System.out.println(mirrorEnds("xxYxx"));
        System.out.println(mirrorEnds("Hi and iH"));
        System.out.println(mirrorEnds("x"));
        System.out.println(mirrorEnds(""));
        System.out.println(mirrorEnds("123and then 321"));
        System.out.println(mirrorEnds("band andab"));

    }

}
