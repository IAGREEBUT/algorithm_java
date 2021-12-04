package Warmup;

public class diff21 {

    public static int diff21(int n) {
        if(n<=21) return 21-n;
        return 2*(n-21);
    }


    public static void main(String[] args) {

        System.out.println(diff21(21));
        System.out.println(diff21(34));
        
    }
}
