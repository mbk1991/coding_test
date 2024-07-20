import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = {};
        
        if(s < n){
            return new int[]{-1};
        }
        
        if(s == n){
            answer = new int[s];
            Arrays.fill(answer, 1);
            return answer;
        }
        
        
        int[] D = new int[n];
        Arrays.fill(D, s/n);
        int rem = s%n;
        for(int i=D.length-1; i>=0; i--){
            if(rem == 0){break;}
            D[i]++;
            rem--;
        }
        
        return D;
    }
}