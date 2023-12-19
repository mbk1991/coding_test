import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
    		List<String> answerArr = new ArrayList<>();
		    HashMap<String,String> idMap = new HashMap<>();
		for(String rec:record) {
			if(rec.startsWith("Enter")) {
				idMap.put(rec.split(" ")[1],rec.split(" ")[2]);
				
			}else if(rec.startsWith("Change")) {
				idMap.put(rec.split(" ")[1],rec.split(" ")[2]);				
			}
		}
		
		for(String rec : record) {
			if(rec.startsWith("Enter")) {
				answerArr.add(idMap.get(rec.split(" ")[1])+"님이 들어왔습니다.");
				
			}else if(rec.startsWith("Leave")) {
				answerArr.add(idMap.get(rec.split(" ")[1])+"님이 나갔습니다.");
				
			}		
		}
			
		String[] answer = new String[answerArr.size()];
		for(int i =0 ; i<answerArr.size();i++) {
			answer[i] = answerArr.get(i);
			}
	    
		
        return answer;
    }
}