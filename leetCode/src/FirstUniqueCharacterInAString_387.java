public class FirstUniqueCharacterInAString_387 {

        public int firstUniqChar(String s) {

            // 해당 알파벳의 갯수를 저장
            int[] letterCount = new int[26];

            // 해당 알파벳이 처음 나온 인덱스를 저장
            int[] letterIndex = new int[26];

            for(int i=0; i<s.length(); i++){

                char c = s.charAt(i);

                //해당 알파벳이 처음 등장한 거라면
                if(letterCount[c-'a']==0){
                    letterIndex[c-'a'] = i; //인덱스가 처음 나온 위치를 저장함
                }

                //갯수를 늘려줌
                letterCount[c-'a']++;
            }

            int result = 100000; //최대값 (s의 length 최대가 100000)

            for(int i=0; i<26; i++){

                if(letterCount[i]==1){ //만약 등장 횟수가 1이면
                    result = Math.min(letterIndex[i],result); //인덱스가 작은거로 변경
                }

            }

            if(result == 100000) return -1; //등장횟수가 1인게 없는 경우임
            return result;

        }

        //모범답안
        public int firstUniqCharBestPractice(String s) {
            int ans = Integer.MAX_VALUE;

            for(char c='a'; c<='z';c++){ //a~z까지 검사

                int index = s.indexOf(c); //해당 c가 string에서 최초로 등장하는 곳(-1이면 발견되지 않은 것임)
                if(index!=-1&&index==s.lastIndexOf(c)){// 발견되었으며 && c가 가장 마지막에 발견된 곳과 인덱스가 동일(한개라는 뜻)
                    ans = Math.min(ans,index);
                }
            }


            return ans==Integer.MAX_VALUE?-1:ans;
        }

}
