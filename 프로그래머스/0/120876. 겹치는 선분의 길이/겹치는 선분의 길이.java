import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int s = getStartIdx(lines[0][0], lines[1][0], lines[2][0]);
        int e = getEndIdx(lines[0][1], lines[1][1], lines[2][1]);
        
        int[] one = getRangeArr(s,e,lines[0]);
        int[] two = getRangeArr(s,e,lines[1]);
        int[] thr = getRangeArr(s,e,lines[2]);
        
        for(int i=0; i<200; i++){
            int tmpCnt = 0;
            
            if(one[i] != 0) tmpCnt++;
            if(two[i] != 0) tmpCnt++;
            if(thr[i] != 0) tmpCnt++;
            
            if(tmpCnt >= 2) answer++;
            
        }
        
        return answer;
    }
    
    
    public int getStartIdx(int a, int b, int c){
        return Math.min(a, Math.min(b,c));
    }
    
    public int getEndIdx(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }
    
    public int[] getRangeArr(int s, int e, int[] r){
        
        int[] arr = new int[200];
        
        int ts,te;
        ts = r[0] + 100;
        te = r[1] + 100 - 1;
       
        
        System.out.println(ts);
        System.out.println(te);
        
        for(int i=0; i<arr.length; i++){
            if(ts <= i && i <= te){
                arr[i] = 1;
            }else{
                arr[i] = 0;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    
    
    
    
}