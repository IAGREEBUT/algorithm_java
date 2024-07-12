package DP;

import java.util.Scanner;

public class LIS_11053 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size+1];
        int[] dp = new int[size+1];

        for(int i=1; i<=size; i++){
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int result = 0;

        dp[0] = 0; // 자기자신만 해당되는 길이
        for (int i=1; i<=size; i++){
            int maxlen = 0; //나보다 작은 수의 최대 lis

            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i] && dp[j]>maxlen){ //본인위치에서 앞쪽으로 계속 탐색했을때 (나보다 작은 수중 제일 큰 lis채택)
                    maxlen = dp[j];
                }
            }
            dp[i] = maxlen + 1; //나보다 작은 수의 lis + 내 길이 (1)

            if(result < dp[i]) result = dp[i]; //계산하는 도중에 제일 큰수를 구해두기 .. 이게맞나

        }


        System.out.println(result);

    }






}
