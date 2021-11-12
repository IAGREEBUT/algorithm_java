package Warmup;

public class frontTimes {

    public static String frontTimes(String str, int n) {

        String answer=""; //답으로 반환될 빈 string

        int len = 3>str.length()?str.length():3; // string의 길이가 3 이상인 경우는 3까지, 이하인 경우는 stirng의 길이만큼

        for(int i=0;i<n;i++)
            answer+=str.substring(0,len);//길이만큼 반복해서 붙여줌

        return answer;

    }

    public static void main(String[] args) {

        System.out.println(frontTimes("Chocolate",3));
        System.out.println(frontTimes("Chocolate",2));


    }


}
