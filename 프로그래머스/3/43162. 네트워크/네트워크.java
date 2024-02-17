/*2402217 10:05*/

import java.util.*;

//stack
class Solution {
    private static boolean[] isVisit;
    private static Stack<Integer> st;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        isVisit = new boolean[n];
        st = new Stack<>();
        
        
        for(int computer=0; computer<n; computer++){
            if(!isVisit[computer]){
                 isVisit[computer] = true;
                 st.push(computer);
                
                 stackDFS(computers);
                 answer++;
            }
        }
        return answer;
    }
    
    void stackDFS(int[][] computers){
        while(!st.isEmpty()){
            int computer = st.pop();
            System.out.println(computer);

            for(int i=0; i<computers[computer].length; i++){
                if((computer!=i) && (computers[computer][i] == 1)){
                    if(!isVisit[i]){
                        isVisit[i] = true;
                        st.push(i);
                    }
                }
            }
        }
    }
}



//recursive
// class Solution {
//     public int solution(int n, int[][] computers) {
//         int answer = 0;
//         boolean[] isVisited = new boolean[n];
        
//         Set<Integer>[] list = new HashSet[n];
//         for(int i=0; i<n; i++){
//             list[i] = new HashSet<Integer>();
//         }
        
//         for(int i=0; i<computers.length; i++){
//             for(int j=0; j<computers[0].length; j++){
//                 if(i==j) continue;
//                 if(computers[i][j] == 1){
//                     list[i].add(j);
//                 } 
//             }
//         }
        
//         for(int i=0; i<n; i++){
//             if(isVisited[i]) continue;
//             chkNetwork(i,list,isVisited);    
//             answer++;
//         }
        
//         System.out.println( Arrays.toString(isVisited) );
        
        
        
//         return answer;
//     }
    
//     void chkNetwork(int computerNo, Set<Integer>[] list, boolean[] visited){

//         if(list[computerNo].size() < 1){
//           return;  
//         }
        
//         if(!visited[computerNo]){
//             visited[computerNo] = true;
//             for(int computer : list[computerNo]){
//                 chkNetwork(computer, list, visited);
//             }
//         }
//         return;
//     }
// }