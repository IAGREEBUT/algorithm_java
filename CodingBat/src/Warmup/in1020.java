package Warmup;

public class in1020 {

    //either (둘 중 하나)
    public static boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }


    public static void main(String[] args) {
        System.out.println(in1020(1,20));
    }
}
