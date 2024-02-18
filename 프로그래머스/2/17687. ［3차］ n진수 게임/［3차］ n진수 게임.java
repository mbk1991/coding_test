import java.util.*;
class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<=999_999_999; i++){
            sb.append(Integer.toString(i,n).toUpperCase());
            if(sb.length() > t*m) break;
        }
        
        char[] cArr = sb.toString().toCharArray();
        StringBuilder tube = new StringBuilder();
        for(int i=p-1; i<cArr.length; i+=m){
            if(tube.length() < t) tube.append(cArr[i]);
        }
        answer = tube.toString();
        
        return answer;
    }
}