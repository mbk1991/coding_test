//2023-12-20 08:27 

class Solution {
    public String solution(String my_string, int[][] queries) {
        
        String answer = my_string;
        
        for(int i=0; i<queries.length; i++){
            System.out.println("i" + i);
            answer = inverseStr(answer, queries[i][0], queries[i][1]);
        }
        
        return answer;
    }
    public String inverseStr(String str, int startIdx, int endIdx){
        String startStr = str.substring(0, startIdx);
        String reverseStr = new StringBuilder(str.substring(startIdx, endIdx+1)).reverse().toString();
        String endStr = str.substring(endIdx+1);
        
        return startStr + reverseStr + endStr;
    }
}