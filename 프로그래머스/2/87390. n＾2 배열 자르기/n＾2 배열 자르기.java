/*
20240104 23:14

123456     012345
223456     67891011 
333456     121314151617 
444456     181920212223 
555556
666666

*/

import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        
        for(long i=left, idx=0; i<=right; i++){
            int row = (int)(i/n);
            int col = (int)(i%n);
            
            if(row>=col){
                answer[(int)idx] = row+1;
            }else{
                answer[(int)idx] = col+1;    
            }
            idx++;
        }
        
        return answer;
    }
}


// 메모리 초과 실패
// class Solution {
//     public int[] solution(int n, long left, long right) {
        
//         int[][] tmp = new int[n][n];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<n; j++){
//                 if(i>=j){
//                     tmp[i][j] = i+1;    
//                 }else{
//                     tmp[i][j] = j+1;
//                 }
//             }
//         }
        
//         int lr = (int)(left / n);
//         int lc = (int)(left % n);
//         int rr = (int)(right / n); 
//         int rc = (int)(right % n);
        
//         int answerSize = (n-lc)
//                          +(rr-lr-1)*n
//                          +(rc+1);
        
//         int[] answer = new int[answerSize];
        
//         for(int i=lr, idx=0; i<=rr; i++){
//             for(int j=0;j<n;j++){
//                 if(i==lr){
//                     if(j>=lc){
//                         answer[idx] = tmp[i][j];  
//                         idx++;
//                     } 
//                 }else if(i==rr){
//                     if(j<=rc){
//                         answer[idx] = tmp[i][j];  
//                         idx++;
//                     } 
//                 }else{
//                         answer[idx] = tmp[i][j];
//                         idx++;
//                 }
//             }
//         }
        
        
        
//         return answer;
//     }
// }