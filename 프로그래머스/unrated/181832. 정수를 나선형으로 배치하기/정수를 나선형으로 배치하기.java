class Solution {
    public int[][] solution(int n) {
        
        
        int[][] answer = new int[n][n];
    
        int fix;
        int increaseStart;
        int increaseEnd;
        int decreaseStart;
        int decreaseEnd; 
        int num = 0;
        
        
        fix = 0;
        increaseStart = 0;
        increaseEnd = n-1;
       
        bk:
        while(true){
            
            //toRight
            for(int i = increaseStart; i <= increaseEnd; i++){
                answer[fix][i] = ++num;
                if(num == n*n) break bk;
            }

            //toDown
            fix = increaseEnd;
            for(int i = increaseStart + 1; i <= increaseEnd; i++){
                answer[i][fix] = ++num;
                if(num == n*n) break bk;
            }

            //toLeft
            fix = increaseEnd;
            decreaseStart = increaseEnd - 1;
            decreaseEnd = increaseStart;
            for(int d = decreaseStart; d >= decreaseEnd; d--){
                answer[fix][d] = ++num;
                if(num == n*n) break bk;
            }

            //toUp
            fix = decreaseEnd;
            decreaseEnd ++;
            for(int d = decreaseStart; d >= decreaseEnd; d--){
                answer[d][fix] = ++num;
                if(num == n*n) break bk;
            }

            //toLeft Setting
            fix = decreaseEnd;
            increaseStart = decreaseEnd;
            increaseEnd = decreaseStart;
        
        }
        
        
        
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println();
        }    
        return answer;
    }
}