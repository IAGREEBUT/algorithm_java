package Warmup;

public class intMax {

    public static int intMax(int a, int b, int c) {
        if(a>b){
            if(a>c) return a;
            else return c;
        }
        else{
            if(b>c) return b;
            else return c;
        }
    }


    public static int intMax2(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }



    public static void main(String[] args) {

        System.out.println(intMax(1,2,3));

    }
}
