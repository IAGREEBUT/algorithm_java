public class moveZeros283 {

        public void moveZeroes(int[] nums) {

            int len = nums.length;

            for(int i=0; i<len; i++){

                if(nums[i] == 0){

                    // index i+1 부터 nums.length()-2 를 한칸씩 앞으로 당기기
                    for(int j=i+1; j< len ; j++){
                        nums[j-1] = nums[j];
                    }

                    //맨 뒤에 0 삽입
                    nums[len-1] = 0;
                    len--; //맨 뒤는 어쩌피 0이라서 탐색하지 않음

                    //이미 검사한 인덱스에 다시 0이 생기는 경우
                    if(nums[i]==0) i--; //해당 인덱스를 다음스탭에서 제 검사

                }


            }

        }


        public void bestPractice(int[] nums){
            int c=0; //인덱스

            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0){
                    nums[c] = nums[i]; // put the numbers(not 0) and move index
                    c++;
                }
            }

            for(int j=c;j<nums.length;j++){
                nums[j] = 0;// fill '0' in left indices
            }


        }

    }
