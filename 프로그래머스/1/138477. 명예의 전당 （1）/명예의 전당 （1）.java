import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(3);
        for(int i=0; i<score.length; i++){
            if(i < k){
                pq.add(score[i]);
            }else if(score[i] > pq.peek()){
                pq.poll();
                pq.add(score[i]);
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}