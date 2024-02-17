/*2402217 10:05*/

import java.util.*;

//stack
/*
테스트 1 〉	통과 (0.46ms, 80.9MB)
테스트 2 〉	통과 (0.66ms, 71.8MB)
테스트 3 〉	통과 (0.65ms, 75.5MB)
테스트 4 〉	통과 (0.57ms, 75.3MB)
테스트 5 〉	통과 (0.29ms, 79.6MB)
테스트 6 〉	통과 (1.41ms, 70.5MB)
테스트 7 〉	통과 (0.52ms, 84.1MB)
테스트 8 〉	통과 (1.17ms, 71.8MB)
테스트 9 〉	통과 (0.89ms, 77MB)
테스트 10 〉	통과 (0.79ms, 73.1MB)
테스트 11 〉	통과 (3.75ms, 80.8MB)
테스트 12 〉	통과 (2.54ms, 79.2MB)
테스트 13 〉	통과 (1.35ms, 84.4MB)
*/
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
/*
테스트 1 〉	통과 (0.21ms, 76.5MB)
테스트 2 〉	통과 (0.30ms, 75.9MB)
테스트 3 〉	통과 (0.41ms, 79.6MB)
테스트 4 〉	통과 (0.24ms, 74.2MB)
테스트 5 〉	통과 (0.30ms, 74.1MB)
테스트 6 〉	통과 (0.66ms, 81MB)
테스트 7 〉	통과 (0.22ms, 83.8MB)
테스트 8 〉	통과 (0.34ms, 73.5MB)
테스트 9 〉	통과 (0.41ms, 75.7MB)
테스트 10 〉	통과 (0.43ms, 73.5MB)
테스트 11 〉	통과 (1.19ms, 67.6MB)
테스트 12 〉	통과 (0.95ms, 75MB)
테스트 13 〉	통과 (0.42ms, 75MB)
*/
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
