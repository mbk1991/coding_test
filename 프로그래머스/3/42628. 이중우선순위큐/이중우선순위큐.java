/*
240121 21:57
*/

import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        List<Integer> list = new LinkedList<>();
        
        for(String s:operations){
            if(s.startsWith("I")){
                list.add(Integer.parseInt(s.replace("I ","")));
            }else if(list.size()>0){
                if(s.contains("-1")){
                    list.remove(0);
                }else{
                    list.remove(list.size()-1);
                }
            }
            Collections.sort(list);
        }
        
        if(list.size() == 0){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = list.get(list.size()-1);
            answer[1] = list.get(0);
            
        }
        
        return answer;
    }
}