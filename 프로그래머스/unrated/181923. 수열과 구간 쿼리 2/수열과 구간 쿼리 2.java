import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int s,e,k;
                
        for(int i=0; i<queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];
            
            int[] tmp = new int[arr.length - (s + (arr.length - e - 1))];
            for(int j=s, l=0; j<=e; j++){
                tmp[l++] = arr[j];
            }
            
            Arrays.sort(tmp);
            for(int n : tmp){
                if( n > k){
                    answer[i] = n;
                    break;
                }
            }
            answer[i] = (answer[i]==0)? -1 : answer[i];
        }
        
        return answer;
    }
}