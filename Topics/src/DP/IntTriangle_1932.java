package DP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntTriangle_1932 {

    static int[][] triArr = new int[501][501]; //삼각형의 최대 크기 500
    static int[][] dp = new int[501][501];

    public void initTriangle(){



    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for(int i=1 ; i<=size; i++){
            for(int j=1 ; j < i+1; j++){ //사이드를 0으로 채워서 null exception안나게
                int num = scanner.nextInt();
                triArr[i][j] = num;
                dp[i][j] = num;
            }
        }


        for(int i=1 ; i<=size; i++){
            for(int j=1 ; j < i+1; j++){
                dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + triArr[i][j];
            }
        }

        //dp[size][~] 에서 최대값을 반환하면됨
        int result = 0;
        for(int i=1; i<=size; i++){
            if(result < dp[size][i]) result = dp[size][i];
        }

        System.out.println(result);

    }

}
