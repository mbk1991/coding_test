class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer += make(numbers[0], 0, numbers, target);
        answer += make(-numbers[0], 0, numbers, target);
        
        return answer;
    }
    
    int make(int sum, int idx, int[] numbers, int target){
        if(idx == numbers.length-1){
            if(sum == target){
                return 1;
            }else{
                return 0;
            }
        }
        int a = 0;
        a += make(sum + numbers[idx+1], idx+1, numbers, target);
        a += make(sum - numbers[idx+1], idx+1, numbers, target);
        return a;
    }
}