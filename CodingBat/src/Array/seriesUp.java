package Array;

import java.util.Arrays;

public class seriesUp {

    public static int[] seriesUp(int n){

        int ans[] = new int[n*(n+1)/2];

        int idx = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                ans[idx++] = j;
            }
        }

        return ans;

    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(seriesUp(2)));
        System.out.println(Arrays.toString(seriesUp(3)));
        System.out.println(Arrays.toString(seriesUp(4)));

    }
}
