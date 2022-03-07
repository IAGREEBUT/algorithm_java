package String;

public class middleThree {

    public static String middleThree(String str) {
        int len = str.length()/2;
        return str.substring(len-1,len+2);
    }


    public static void main(String[] args) {
        System.out.println(middleThree("hithere"));
    }
}
