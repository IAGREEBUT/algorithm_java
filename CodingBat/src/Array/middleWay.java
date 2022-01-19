package Array;

public class middleWay {

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};
    }


    public static void main(String[] args) {

        int []a = {1,2,3};
        int []b = {3,4,5};

        System.out.println(middleWay(a,b));
    }
}
