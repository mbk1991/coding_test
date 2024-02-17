import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = -1;
        
        Set<Integer>[] lists = new HashSet[n+1];
        for(int i=0; i<lists.length; i++){
            lists[i] = new HashSet<Integer>();
        }
        
        
        for(int[] link:wires){
            lists[link[0]].add(link[1]);
            lists[link[1]].add(link[0]);
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int[] link:wires){
            int a = cntLinkNode(lists, link[0], link[1]);
            int b = cntLinkNode(lists, link[1], link[0]);
            
            if(Math.abs(a-b) < min) min = Math.abs(a-b);
        }
               
        answer = min;
        return answer;
    }
    
    int cntLinkNode(Set<Integer>[] lists, int base, int other){
        if((lists[base].size()-1) == 0){
            return 1;
        }
        
        int cnt = 1;
        for(int node : lists[base]){
            if(node != other){
                cnt += cntLinkNode(lists, node, base);
            }
        }
        
        return cnt;
    }
}