import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] priorityDesc = Arrays.stream(priorities).boxed().sorted((a,b)->b-a).mapToInt(Integer::valueOf).toArray();
        int hieghestIdx = 0;
        Queue<Process> processQueue = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++){
            processQueue.offer( new Process(i, priorities[i]));
        }
        
        while(processQueue.size() != 0){
            Process thisProcess = processQueue.poll();
            
            if(priorityDesc[hieghestIdx] > thisProcess.pri){
                processQueue.offer(thisProcess);
            }else{
                answer++; 
                if(thisProcess.no == location){
                    break;
                }
                hieghestIdx++;
            }
        }
        return answer;
    }
}

class Process{
    public final int no;
    public final int pri;
    public Process(int no, int pri){
        this.no = no;
        this.pri = pri;
    }
}
