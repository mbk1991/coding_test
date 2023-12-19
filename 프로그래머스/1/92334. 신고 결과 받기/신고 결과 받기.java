import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;


class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        
        int[] answer = new int[id_list.length];        
        Set<String> reportSet = new HashSet<String>(Arrays.asList(report));
        ArrayList<String[]> reportArray = new ArrayList<String[]>();
        Map<String,Integer> idNumMap = new HashMap<>();
        
        for(int n = 0; n<id_list.length; n++){
            idNumMap.put(id_list[n],n);
        }
                
        for(String reportRecord: reportSet){
            String reporter = reportRecord.split(" ")[0];
            String defendant = reportRecord.split(" ")[1];
            String[] recordArr = {reporter,defendant};
            reportArray.add(recordArr);
        }
        
        for(String member: id_list){
            int countReport = 0;
            for(String[] records: reportArray){
                  if(member.equals(records[1])){
                      countReport++;
                }
            }
        
           
            if(countReport >= k){
              
                   for(String[] records: reportArray){
                      if(member.equals(records[1])){
                        answer[idNumMap.get(records[0])]++;
                         }    
                     }
                  }
        }
        
        
     return answer;
            
        }             
    }