package Warmup;

public class monkeyTrouble {

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

        if(aSmile && bSmile) return true;
        if(!aSmile && !bSmile) return true;
        return false;

    }

    public static boolean monkeyTrouble2(boolean aSmile, boolean bSmile){

        return (aSmile==bSmile);

    }


    public static void main(String[] args) {

        System.out.println(monkeyTrouble(false, false));

    }

}
