import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        Set<Character> skips = new HashSet<>();
        for(char c:skip.toCharArray()){
            skips.add(c);
        }
        
        List<Character> alphabets = new ArrayList<>();
        for(char c = 'a'; c <= 'z'; c++){
            if(skips.contains(c)) continue;
            alphabets.add(c);
        }
        
        //System.out.println(alphabets);
        
        for(char c:s.toCharArray()){
            int i = (alphabets.indexOf(c) + index) % alphabets.size();
            
            answer += alphabets.get(i);
        }
        
        return answer;
    }
}