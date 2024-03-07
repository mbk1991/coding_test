/****/

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        for(int n:  scoville){
            pq.add(n);
        }
        
        while(pq.size()>1 && pq.peek() < K){
            int smaller = pq.poll();
            int secondSmaller = pq.poll();
            pq.add(combine(smaller, secondSmaller));
            
            answer++;
        }
        
        if(pq.peek() < K) return -1;
        
        return answer;
    }
    
    public int combine(int smaller, int secondSmaller){
        return smaller + (secondSmaller * 2);
    }
}