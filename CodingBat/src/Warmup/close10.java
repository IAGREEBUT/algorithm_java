package Warmup;

public class close10 {

    public static int close10(int a, int b) {
        int sub_a = Math.abs(a-10);
        int sub_b = Math.abs(b-10);

        if(sub_a > sub_b) return b;
        else if(sub_a < sub_b ) return a;
        else return 0;
    }


    public static void main(String[] args) {
        System.out.println(close10(10,2));
    }
}
