package Warmup;

public class loneTeen {

    public static boolean loneTeen(int a, int b) {
        if(a>=13 && a<=19) //a is teen
            return (b<13 || b>19);//b is not teen
        else//a is not teen
            return (b>=13 && b<=19);//b is teen
    }


    //solution
    public boolean loneTeen2(int a, int b) {
        //a 와 b의 teen 여부
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);//둘중 하나만 teen 인 경우
    }


    public static void main(String[] args) {
        System.out.println(loneTeen(12,16));
    }
}
