package Array;

public class canBalance {


    public static boolean canBalance(int[] nums) {

        //배열크기가 1 이하면 무조건 불가능
        if(nums.length<=1) return false;

        //인덱스포인터
        int left = 0, right = 1;

        // 왼쪽 배열의 합 (첫원소)
        int sumL = nums[left];

        //오른쪽 배열의 합 (인덱스 1 ~ 끝까지)
        int sumR = 0;
        for(int i=right; i<nums.length; i++){
            sumR+=nums[i];
        }

        while(right<nums.length){
            if(sumR == sumL) return true; //합이 같으면 true
            sumL+=nums[++left];//왼쪽 배열을 한개 늘리기
            sumR-=nums[right++];//오른쪽 배열을 하나 줄이기
        }

        return false;//한바퀴 돌았는데도 못찾았으면 불가능한 경우

    }

    //배열의 수가 전부 양수일 때만 가능
    public static boolean canBalanceOnlyPositive(int[] nums) {

        if(nums.length<=1) return false;

        int left = 0;
        int right = nums.length - 1;

        int sumR = nums[right];
        int sumL = nums[left];

        while(right-left != 1){
            if(sumR>=sumL)
                sumL += nums[++left];
            else
                sumR += nums[--right];
        }

        if(sumL==sumR) return true;
        else return false;

    }



    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(canBalance(arr));

        int arr2[] = {1,1,1,2,1};
        System.out.println(canBalance(arr2));
    }
}
