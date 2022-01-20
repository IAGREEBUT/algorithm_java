package String;

public class left2 {

    public static String left2(String str) {

        //if(str.length()<=2) return str;//길이가 2 이하면 그대로 리턴 -> 예외처리 안해도 괜찮

        return str.substring(2)+str.substring(0,2);

    }


    public static void main(String[] args) {
        System.out.println(left2("hi"));
        System.out.println(left2("hello"));
    }
}
