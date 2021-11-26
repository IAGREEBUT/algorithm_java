package Warmup;

public class altPairs {


    public static String altPairs(String str){

        int len = str.length();

        String ans="";
        int i=0;
        while(i<len){
            ans+=str.substring(i,i+1); //1자
            if(i%2==0) i++;
            else i=i+3;
        }

        return ans;
    }

    //sample answer
    public String altPairs2(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i=0; i<str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));


    }





}
