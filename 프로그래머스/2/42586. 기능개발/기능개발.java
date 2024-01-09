import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] days = new int[progresses.length];
        for(int i=0; i<days.length; i++){
            int p = progresses[i];
            int s = speeds[i];
            days[i] = ((100-p)%s == 0)? (100-p)/s : (100-p)/s+1;
        }
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        dq.addLast(days[0]);
        for(int i=1; i<days.length; i++){
            System.out.println("dq.getFirst(): " + dq.getFirst());
            if(dq.getFirst() >= days[i]){
                dq.addLast(days[i]);
            }else{
                list.add(dq.size());
                dq.clear();
                dq.addLast(days[i]);
            }
        }
        if(!dq.isEmpty()){
            list.add(dq.size());
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}