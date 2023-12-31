import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        
        A:
        for(int i=1;;i++){
            for(int j=arr.length-1; j>=0; j--){
                if((max*i) % arr[j] != 0){
                    break;
                }else{
                    if(j == 0){
                        answer = max*i;
                        break A;
                    }
                }
            }
        }
        return answer;
    }
}