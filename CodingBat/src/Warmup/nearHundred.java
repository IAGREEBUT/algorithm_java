package Warmup;

public class nearHundred {

    public static boolean nearHundred(int n) {

        return(Math.abs(n-100)<=10 || Math.abs(n-200)<=10);

    }


    public static void main(String[] args) {

        nearHundred(10);
    }

}
