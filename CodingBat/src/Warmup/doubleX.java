package Warmup;

public class doubleX {


    boolean doubleX(String str) {

        int len = str.length();
        String tmp;

        for(int i=0;i<len-1;i++){
            tmp = str.substring(i,i+2);
            if(tmp.equals("xx")) return true;
        }

        return false;


    }


    public static void main(String[] args) {




    }

}
