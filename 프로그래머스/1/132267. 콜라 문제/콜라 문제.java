/*
빈병1에 1병을 주는 마트가 있다면 좋겠다.
*/

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a){
            answer += (n/a)*b;
            n = (n/a)*b + (n%a);
        }
        
        return answer;
    }
}