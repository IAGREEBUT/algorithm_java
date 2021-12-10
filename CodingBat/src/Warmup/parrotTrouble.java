package Warmup;

public class parrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour){

        if(talking){
            if(hour<7 || hour>20) return true;
        }

        return false;

        //return (talking && (hour < 7 || hour > 20));

    }

    public static void main(String[] args) {

    }
}
