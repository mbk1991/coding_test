/*
20240102 23:39
1)문자열 회전
2)올바른 문자열인지 확인 및 cnt


*/

import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            if(chkCorrectStr(s)){
                answer ++;
            }
            s=rotationLeftOne(s);
        }
        
        return answer;
    }
    
    private String rotationLeftOne(String s){
        StringBuilder sb = new StringBuilder(s);
        char tmp = sb.charAt(0);
        sb.deleteCharAt(0);
        sb.append(tmp);
        return sb.toString();
        
    }
    
    private boolean chkCorrectStr(String s){
        Stack<Character> st = new Stack<>();
        char[] charArr = s.toCharArray();
        
        for(char c:charArr){
            if(!st.isEmpty()){
                if((st.peek()/10 == c/10) && st.peek() < c){
                    st.pop();
                }else{
                    st.push(c);
                }
            }else{
                 st.push(c);
             }
        }
        return (st.isEmpty())? true:false;
    }
}