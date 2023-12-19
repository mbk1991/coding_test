import java.util.ArrayList;
class Solution {
    public int solution(String s) {
        
		String answerString = "";
		int answer = s.length();
		ArrayList<String> sArray = new ArrayList<String>();
		
		for(int i = 1; i <= s.length()/2;i++){
			answerString = "";
				sArray.clear();
				for(int n = 0; n<=s.length()-1;n+=i){
					
					try {
						sArray.add(s.substring(n,n+i));
					} catch (Exception e) {
						sArray.add(s.substring(n,s.length()));
					}
				}			
			    
		
		int zipCount = 1;
		for(int j =0 ; j<sArray.size();j++) {
			String temp = sArray.get(j);
		
			if(j == sArray.size()-1) {
				if(zipCount ==1) {
					answerString += temp;
					break;
				}else if(zipCount !=1) {
					answerString += (Integer.toString(zipCount)+temp);
					break;
				}
			}
			if(temp.equals((sArray.get(j+1)))) {
				zipCount ++;
				
			}else if(!temp.equals((sArray.get(j+1)))) {
				if(zipCount ==1) {
					answerString += temp;
					
				}else if (zipCount != 1) {
					answerString += (Integer.toString(zipCount)+temp);
			}
				zipCount = 1;
			}
		}	
	
		
		if(answer>answerString.length()) {
			answer = answerString.length();
		}
		
		}
		return answer;
	
		}
}