package Array;

import java.util.Arrays;

public class sqaureUp {

    /*
    답은 1차원 array이지만, 생각(이해)은 2차원 배열으로 하는게 편함

    i행에서 가장 큰 수는 "i", 가장 작은 수는 1

     */

    public static int[] squareUp(int n){
        int[] ans = new int[n * n]; // n*n으로 배열 초기화 & 선언

        int idx=0;//배열의 인덱스
        for(int i=1;i<=n;i++){ //1행~n행 까지
            for(int j=n; j>=1; j--){ //i행은 n열을 보유함
                if(j<=i) ans[idx++] = j; // j가 해당 행의 최댓값에 도달하면, 한개씩 줄여가면서 배열에 삽입
                else ans[idx++] = 0; // 그 외는 0으로 채우기
            }
        }
        return ans;
    }

    public static int[] squareUp2(int n){
        int[] ans = new int[n * n]; // n*n으로 배열 초기화(0으로 초기화됨) & 선언

        int idx=0;
        for(int i=1;i<=n;i++){ //1행~n행 까지
            for(int j=n; j>=1; j--){ //i행은 n열을 보유함
                if(j==i) idx = i*(n-1); //최초로 0이 아닌 수는 i * (n-1) 인덱스의 위치임
                if(j<=i) ans[idx++] = j; // 인덱스가 정해진 이후로는 j를 대입해줌
            }
        }
        return ans;
    }


    // https://github.com/mirandaio/codingbat/blob/master/java/array-3/squareUp.java
    public static int[] squareUp3(int n) {
        int[] arr = new int[n*n];

        if(n == 0)
            return arr;

        for(int i = n - 1; i < arr.length; i += n) {//i : 행의 마지막 열의 index (0부터 시작이므로 n-1)
            for(int j = i; j >= i - i / n; j--) //가야하열는 만큼 앞으로 가기위해 -- : 1행부터 시작이라고 가정, i/n = 1행에서 0, 2행에서 1 ,..
                arr[j] = i - j + 1;//행의 마지막 열 - 행에서 수를 삽입할 차례인 열 + 1
        }

        return arr;
    }

    public static void main(String[] args) {


//        System.out.println(Arrays.toString(squareUp2(2)));
//        System.out.println(Arrays.toString(squareUp2(3)));
        System.out.println(Arrays.toString(squareUp2(4)));



    }
}
