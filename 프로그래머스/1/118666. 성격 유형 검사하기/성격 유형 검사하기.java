import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        //Map을 사용하면 어떨까.
        //key에 여덟개의 유형을 놓고
        //value에 점수를 넣는다.
        //모든 점수를 적용한 후에 결과를 출력한다.
        
        Map<String,Integer> map = new HashMap<>();
        map.put("R",0);
        map.put("T",0);
        map.put("C",0);
        map.put("F",0);
        map.put("J",0);
        map.put("M",0);
        map.put("A",0);
        map.put("N",0);
        
        for(int i= 0; i<choices.length; i++){
            int point = choices[i]-4;
            if(point < 0){ 
                String negativeKey = survey[i].substring(0,1);
                int tempNegaPoint = map.get(negativeKey) + (-point);    
                map.put(negativeKey,tempNegaPoint);
            }else if(point > 0){  
                String positiveKey = survey[i].substring(1,2);
                int tempPosiPoint = map.get(positiveKey) + (point);    
                map.put(positiveKey,tempPosiPoint);
            }
        }
        
        String answer = "";
        if(map.get("R")>=map.get("T")){
            answer += "R";
        }else{
            answer += "T";
        }
        if(map.get("C")>=map.get("F")){
            answer += "C";
        }else{
            answer += "F";
        }
        if(map.get("J")>=map.get("M")){
            answer += "J";
        }else{
            answer += "M";
        }
        if(map.get("A")>=map.get("N")){
            answer += "A";
        }else{
            answer += "N";
        }
        
    
        
        
        
//         for(String type: survey){
//             System.out.println(type.substring(0,1));
//             System.out.println(type.substring(1,2));
            
//         }
        
        
        
        
        
        return answer;
    }
}