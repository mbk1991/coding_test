import java.util.*;

class Solution {
    public int[] solution(String msg) {
        int[] answer = {};
        Map<String,Integer> dictionary = new HashMap<>();
        int idx = 1;
        for(char c = 'A'; c<='Z'; c++){
            dictionary.put(""+c,idx++);
        }
        
        List<Integer> a = new ArrayList<>();
        
        addIdxAndRegiWord(msg, dictionary, a);
        
        answer= a.stream().mapToInt(Integer::valueOf).toArray();
        
        return answer;
    }
    
    void addIdxAndRegiWord(String s, Map<String,Integer> d,  List<Integer> l){
        s = s.toUpperCase();
        int lastIdx = 26;
        int idx = 0;
        for(int j=0; j<s.length(); j++){
            for(int i=j; i<s.length(); i++){
                String tmpKey = s.substring(j,i+1);
                
                if(d.containsKey(tmpKey)){
                    idx = d.get(tmpKey);
                }else{
                    l.add(idx);
                    d.put(tmpKey,++lastIdx);
                    j=i-1;
                    break;                
                }
                
                if(i == s.length()-1){
                    j = s.length();
                }
            }
        }
        l.add(idx);
    }
}