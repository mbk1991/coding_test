//231228 00:00
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        
        A:
        for(int i=3; i<=sum; i++){
            if(i*i<sum)continue;
            for(int j=i; j>0; j--){
                if(i*j == sum){
                    if((i-2)*(j-2) == yellow){
                        answer[0] = i;
                        answer[1] = j;
                        break A;
                    }
                }
            }
        }
        
        
        return answer;
    }
}