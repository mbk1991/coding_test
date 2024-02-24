import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        List<String> l1 = convList(str1);
        List<String> l2 = convList(str2);
        
        int inter = cntInter(l1,l2);
        int sum = cntSum(l1,l2) - inter;
        
        double j = 1;
        if(sum != 0)
            j = ((double)inter/sum);
        return (int)(j*65536);
    }
    
    public List<String> convList(String s){
        List<String> l = new ArrayList<>();
        char[]cArr = s.toCharArray();
        
        for(int i=0; i<cArr.length-1; i++){
            
            if( Character.isAlphabetic(cArr[i]) && Character.isAlphabetic(cArr[i+1]) ){
                l.add((""+cArr[i]+cArr[i+1]).toUpperCase());
            }
        }
        return l;
    }
    
    public int cntInter(List<String> l1, List<String> l2){
        int a = 0;
        boolean[] chk = new boolean[l2.size()];
        for(int i=0; i<l1.size(); i++){
            for(int j=0; j<l2.size(); j++){
                if(!chk[j] && l1.get(i).equals(l2.get(j))){
                    a ++;
                    chk[j] = true;
                    break;
                }                
            }
        }
        return a;   
    }
    
    public int cntSum(List<String> l1, List<String> l2){
        int a = 0;
        a = l1.size() + l2.size();
        return a;   
    }
}