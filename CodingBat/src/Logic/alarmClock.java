package Logic;

public class alarmClock {

    public static String alarmClock(int day, boolean vacation) {

        boolean weekend = true;
        if(day>=1 && day<=5) weekend = false;


        if(vacation && weekend) return "off";
        if(weekend || vacation) return "10:00";
        return "7:00";


    }


    public static void main(String[] args) {
        System.out.println(alarmClock(1, false));
        System.out.println(alarmClock(5, false));
        System.out.println(alarmClock(0, false));
        System.out.println(alarmClock(1, true));
        System.out.println(alarmClock(6, true));
    }

}
