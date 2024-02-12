/*
1.섹션을 배열로 구현한다. 칠할 곳이 아니면 -1 , section+1 길이
2.section 순회, before + m 이하인 경우 스킵
3.칠할 때 count
횟수는 section.length 이하.
*/

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        int before = section[0];
        
        for(int i=1; i<section.length; i++){
            if((before + m - 1) >= section[i]){
                continue;
            }
            before = section[i];
            answer++;
        
        }
        return answer;
    }
}