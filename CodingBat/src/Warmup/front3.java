package Warmup;

public class front3 {

    public static String front3(String str) {

        if(str.length()<3) return str+str+str;

        String front = str.substring(0,3);

        return front+front+front;

    }


    public static void main(String[] args) {

        System.out.println(front3("java"));
        System.out.println(front3("ab"));

    }

}
