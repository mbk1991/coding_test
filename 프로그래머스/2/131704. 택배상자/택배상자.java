import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        int curr = 1;
        for(int i=0; i<order.length; i++){
            int o = order[i];
            
            if(!stack.isEmpty() && o == stack.peek()){
                stack.pop();
                answer ++;
                continue;
            }
            
            while(o != curr){
                stack.push(curr);
                curr++;           
                if(curr > order.length){
                    return answer;
                }
            }
            answer ++;
            curr ++;
            
        }
        
        return answer;
    }
}