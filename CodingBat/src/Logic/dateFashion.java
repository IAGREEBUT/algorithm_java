package Logic;

public class dateFashion {


    //either vs both
    public static int dateFashion(int you, int date) {
        if((you>=8&&date>2)||(date>=8&&you>2)) return 2;
        else if(you<=2 || date<=2) return 0;
        return 1;

    }



    public static void main(String[] args) {

        System.out.println(dateFashion(10,2));

    }

}
