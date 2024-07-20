class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int xCnt = 0;
        int oCnt = 0;
        int idx = 0;
        char[] cArr = s.toCharArray();
        
        for(int i=0; i<cArr.length; i++){
            
            char x = s.charAt(idx);
            if(cArr[i] == x){
                xCnt++;
            }else{
                oCnt++;
            }

            if(xCnt == oCnt){
                answer++;
                idx = i+1;
                continue;
            }
        }
        
        if(xCnt != oCnt){
            answer++;
        }

        return answer;
    }
}