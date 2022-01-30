package Warmup;

public class mixStart {

    public static boolean mixStart(String str) {
        if(str.length()<3) return false;
        return str.substring(1,2).equals("i") && str.substring(2,3).equals("x") ;
    }


    public static boolean mixStart_solution(String str) {
        if (str.length() < 3) return false;

        // Pull out length 2 string for the "ix" part
        // (i.e. substring starting at index 1 and stopping just before 3).
        String two = str.substring(1, 3);
        // This last part can be shortened to just:
         return(two.equals("ix"));
    }

    public static void main(String[] args) {
        System.out.println(mixStart("pix ix"));
    }
}
