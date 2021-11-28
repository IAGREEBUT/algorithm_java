package Warmup;

public class has271 {


    public static boolean has271(int[] nums){

        int len = nums.length;

        if(len<3) return false;//길이 3 이하면 검사도 불가능

        for(int i=0; i<len-2; i++){//마지막 2칸을 남겨둬야 3개 검사가능
            int number = nums[i];
            if(number+5 == nums[i+1]){//2번쨰 수는 1번쨰 수 +5
                if(nums[i+2]<= number + 1 && nums[i+2]>= number-3) return true;//3번째 수는 1번째 수 -1 한 값에서 +-2
            }
        }
        return false;//다 도는 동안 없었으면 false
    }


    public static void main(String[] args) {

        int []nums = {2, 7, -2, 4, 9, 3};
        System.out.println(has271(nums));

    }



}
