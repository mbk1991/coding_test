import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String strMax = "";
        String strMin = "";
        String[] strArr = s.split(" ");
        int[] intArr = new int[strArr.length];
        
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(intArr);
        
        strMax = String.valueOf(intArr[intArr.length-1]);
        strMin = String.valueOf(intArr[0]);
        
        answer = strMin + " " + strMax;
        
        return answer;
    }
}