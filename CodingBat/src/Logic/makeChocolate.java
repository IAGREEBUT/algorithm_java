package Logic;

public class makeChocolate {

    public static int makeChocolate(int small, int big, int goal) {


        int bigNum = goal/5;
        if(bigNum > big) bigNum = big;

        int r = goal - bigNum*5;

        if( r<0 ) return -1;
        else if(r-small>0) return -1;
        else return r;

    }

    public static void main(String[] args) {
        System.out.println(makeChocolate(1,4,9));
    }


}
