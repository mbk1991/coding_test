import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        Stack<Integer> a = new Stack<Integer>();
        for(int i:A){
            a.push(i);
        }
        
        for(int i=B.length-1; i>=0; i--){
            
            while(!a.empty()){
                
                if(a.pop() < B[i]){
                    answer++;
                    break;
                }
                
            }

        }
        
        return answer;
    }
}