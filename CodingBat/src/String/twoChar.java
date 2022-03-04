package String;

public class twoChar {


    public static String twoChar(String str, int index) {
        if(index+2>str.length() || index<0) return str.substring(0,2);
        return str.substring(index,index+2);
    }


    public static void main(String[] args) {
        System.out.println(twoChar("hello",3));
    }


}
