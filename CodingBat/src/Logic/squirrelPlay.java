package Logic;

public class squirrelPlay {

    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer){

            if(temp>=60 && temp<=100) return true;
            return false;

        }else{

            if(temp>=60 && temp<=90) return true;
            return false;

        }
    }

    public static void main(String[] args) {
        System.out.println(squirrelPlay(95,true));
    }


}
