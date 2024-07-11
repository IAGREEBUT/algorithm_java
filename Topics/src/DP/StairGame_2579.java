package DP;

import java.util.Scanner;

public class StairGame_2579 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] stairs = new int[size + 1];
        int[] dp = new int[size + 1];

        for (int i = 1; i <= size; i++) { //맨 첫번쨰 칸은 0점
            int num = scanner.nextInt();
            stairs[i] = num;
        }

        //2번째 칸까지는 수동계산

        if(size > 1) {
            dp[0] = 0;
            dp[1] = stairs[1];
            dp[2] = stairs[1] + stairs[2];

            for (int i = 3; i <= size; i++) {
                dp[i] = Math.max(dp[i - 2], stairs[i - 1] + dp[i - 3]) + stairs[i];
            }

            System.out.println(dp[size]);
        }
        else{ //계단이 1개만 존재할떄 outofbound
            System.out.println(stairs[size]);
        }
    }


}
