package Warmup;

public class icyHot {


    public static boolean icyHot(int temp1, int temp2) {
        return temp1*temp2 < -100;
    }


    public static void main(String[] args) {
        System.out.println(icyHot(1,100));
        System.out.println(icyHot(-1,-100));
    }


}
