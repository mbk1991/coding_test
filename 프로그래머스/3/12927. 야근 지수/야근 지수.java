import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:works){
            pq.offer(i);
        }
        
        while(n>0){
            if(pq.peek() == 0) break;
            Integer a = pq.poll();
            pq.offer(--a);
            --n;
        }
        
        while(pq.size()>0){
            int p = pq.poll();
            answer+= p*p;
        }
        return answer;
    }

}