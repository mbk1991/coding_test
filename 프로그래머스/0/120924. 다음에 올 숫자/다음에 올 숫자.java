class Solution {
    public int solution(int[] common) {
        int answer = 0;
        boolean isCDS = ((common[1]- common[0]) == common[2] - common[1])? true : false;
        
        if(isCDS){
            answer = common[common.length-1] + (common[1] - common[0]);
        }else{
            answer = common[common.length-1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}