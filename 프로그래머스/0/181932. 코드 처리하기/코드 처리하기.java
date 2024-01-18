import java.util.*;

class Solution {
    public String solution(String code) {
        boolean zeroMode = true;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<code.length(); i++){
            char c = code.charAt(i);
            if(c=='1'){
                zeroMode = !zeroMode;
                continue;
            }
            if(zeroMode){
                if(i%2==0) sb.append(c);
            }else{
                if(i%2==1) sb.append(c);
            }  
        }
        return sb.length()!=0? sb.toString() : "EMPTY";
    }
}