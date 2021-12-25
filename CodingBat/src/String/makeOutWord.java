package String;

public class makeOutWord {

    public static String makeOutWord(String out, String word) {

        int len = out.length();

        return out.substring(0,len/2)+word+out.substring(len/2+1,len+1);


    }


    public static void main(String[] args) {

        System.out.println(makeOutWord("<<>>","ya"));
        
    }
}
