package DP;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci_18700 {


    public static int fibonacci(int n){

        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);

    }

    static long[] fibArr = new long[1000001];

    public static long fibonacciDP(int n){

        for (int i = 2; i <= n; i++) {
            fibArr[i] = (fibArr[i - 1] + fibArr[i - 2])%1000000007;
        }

        return fibArr[n];
    }

    public static void main(String[] args) {
        fibArr[0] = 0;
        fibArr[1] = 1;
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        System.out.println(fibonacciDP(c));

    }


}
