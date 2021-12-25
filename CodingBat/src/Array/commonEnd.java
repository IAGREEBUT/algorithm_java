package Array;

public class commonEnd {

    public static boolean commonEnd(int[] a, int[] b) {
        return (a[0]==b[0] || a[a.length-1]==b[b.length-1]);
    }


    public static void main(String[] args) {


        int []a= {1,2,3};
        int []b={1,3};

        System.out.println(commonEnd(a,b));
    }

}
