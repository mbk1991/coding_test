import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        Deque<String> deck1 = new LinkedList<>();
        Deque<String> deck2 = new LinkedList<>();
        
        for(int i=cards1.length-1; i>= 0; i--){
            deck1.addFirst(cards1[i]);
        }
        for(int i=cards2.length-1; i>= 0; i--){
            deck2.addFirst(cards2[i]);
        }
        
        for(String str:goal){
            
            if(!deck1.isEmpty() &&  str.equals(deck1.getFirst())){
                deck1.removeFirst();
                continue;
            }else if(!deck2.isEmpty() &&  str.equals(deck2.getFirst())){
                deck2.removeFirst();
                continue;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}