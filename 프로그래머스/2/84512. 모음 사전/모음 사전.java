import java.util.*;

class Solution {
    public int solution(String word) {
        List<String> list = new ArrayList<>();
        comb("",list);
              
        return list.indexOf(word);
    }
    
    void comb(String word, List<String> list){
        list.add(word);
        if(word.length() == 5) return;
        comb(word+'A', list);
        comb(word+'E', list);
        comb(word+'I', list);
        comb(word+'O', list);
        comb(word+'U', list);
    }
}