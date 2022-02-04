package String;

public class middleTwo {

    public static String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);
    }


    public static void main(String[] args) {
        System.out.println(middleTwo("hell"));
        System.out.println(middleTwo("123456"));
    }
}
