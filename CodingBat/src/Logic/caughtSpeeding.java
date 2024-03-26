package Logic;

public class caughtSpeeding {

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        int bPoint = 0;

        if(isBirthday) bPoint = 5;

        if(speed<=60+bPoint) return 0;
        else if(speed<=80+bPoint) return 1;
        return 2;

    }


    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60,false));
    }

}
