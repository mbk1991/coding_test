/*2402217 10:05*/


import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isVisited = new boolean[n];
        
        Set<Integer>[] list = new HashSet[n];
        for(int i=0; i<n; i++){
            list[i] = new HashSet<Integer>();
        }
        
        for(int i=0; i<computers.length; i++){
            for(int j=0; j<computers[0].length; j++){
                if(i==j) continue;
                if(computers[i][j] == 1){
                    list[i].add(j);
                } 
            }
        }
        
        for(int i=0; i<n; i++){
            if(isVisited[i]) continue;
            chkNetwork(i,list,isVisited);    
            answer++;
        }
        
        System.out.println( Arrays.toString(isVisited) );
        
        
        
        return answer;
    }
    
    void chkNetwork(int computerNo, Set<Integer>[] list, boolean[] visited){

        if(list[computerNo].size() < 1){
          return;  
        }
        
        if(!visited[computerNo]){
            visited[computerNo] = true;
            for(int computer : list[computerNo]){
                chkNetwork(computer, list, visited);
            }
        }
        return;
    }
}