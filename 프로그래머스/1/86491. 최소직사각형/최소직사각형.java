class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int longSideMax = 0;
        int shortSideMax = 0;
        int tempLongSide = 0;
        int tempShortSide = 0;
        
        for(int i = 0; i < sizes.length; i++){          
            if(sizes[i][0] > sizes[i][1]){  
                tempLongSide = sizes[i][0];
                tempShortSide = sizes[i][1];
                } else{
                tempLongSide = sizes[i][1];
                tempShortSide = sizes[i][0];
            }
            if(tempLongSide > longSideMax){
                longSideMax = tempLongSide;
            }
            if(tempShortSide > shortSideMax){
                shortSideMax = tempShortSide;
            }            
        }
         
        answer = longSideMax * shortSideMax;
        return answer;
    }
}