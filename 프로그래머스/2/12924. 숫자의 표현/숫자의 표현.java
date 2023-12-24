//231224 16:56

class Solution {
    public int solution(int n) {
        int answer = 0;
        int s = 1;
        int e = 1;
        
        while(e <= n){
            int tmp = 0;
            for(int i=s; i<=e; i++){
                tmp+=i;
            }   
            if(tmp == n){
                answer++;
                s++;
                e++;
            }else if(tmp > n){
                s++;
            }else if(tmp < n){
                e++;
            }
        }
        
        return answer;
    }
}