package Warmup;

public class lastDigit {

    public static boolean lastDigit(int a, int b) {
        return(a % 10 == b % 10);
    }


    public static void main(String[] args) {
        System.out.println(lastDigit(10,20));
    }
}
