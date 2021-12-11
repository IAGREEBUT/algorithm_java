package Logic;

public class cigarParty {

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend && cigars>=40) return true;

        if(cigars>=40 && cigars<=60) return true;

        return false;

    }


    public static void main(String[] args) {

        System.out.println(cigarParty(10,true));
        
    }
}
