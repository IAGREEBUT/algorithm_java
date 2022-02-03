package Warmup;

public class startOz {

    public static String startOz(String str) {
        if(str.length()>=2)
            if(str.substring(0,2).equals("oz")) return "oz";
        if(str.length()>=1){
            if(str.substring(0,1).equals("o")) return "o";
            if(str.substring(1,2).equals("z")) return "z";
        }
        return "";
    }

    public static String startOz2(String str){
        String result = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
    }

}
