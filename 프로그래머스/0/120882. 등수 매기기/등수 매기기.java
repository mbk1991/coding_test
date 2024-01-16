import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        for(int i=0; i<average.length; i++){
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }
        Arrays.sort(average);
        
        int[] rank = new int[average.length];
        for(int i=0; i<average.length; i++){
            int tmp = i+1;
            int cnt = 0;
            while(tmp < average.length){
                if(average[i] < average[tmp]){
                    cnt++;
                }
                tmp++;
            }
            rank[i] = cnt + 1;
        }
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<score.length; j++){
                if((score[i][0] + score[i][1])/2.0 == average[j]){
                    answer[i] = rank[j];
                    break;
                }
            }
        }
        
        return answer;
    }
}