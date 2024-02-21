public class reverseString_344 {

        public void reverseString(char[] s) {

            int len = s.length;

            char[] ss = new char[len];
            for(int i=0; i<s.length; i++){
                len--;
                ss[i] = s[len];
            }

            for(int i=0; i<s.length; i++){
                s[i] = ss[i];
            }

        }


        public void bestPractice(char[] s){

            int left = 0;
            int right = s.length-1;

            while(left<right){

                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;

                left++;
                right--;

            }


        }

    }
