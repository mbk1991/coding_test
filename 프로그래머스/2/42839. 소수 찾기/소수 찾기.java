import java.util.*;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        char[] charNumbers = numbers.toCharArray();
        boolean[] isUse = new boolean[charNumbers.length];       
        Set<Integer> allCase = new HashSet<>();
        
        comb("",charNumbers,isUse,allCase);
        System.out.println(allCase);
        
        for(int num:allCase){
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    void comb(String numbers,char[] charNumbers,boolean[] isUse,Set<Integer> allCase){
        try{
            allCase.add(Integer.parseInt(numbers));
        }catch(Exception e){
            // System.out.println(e.getMessage());
        }
        if(numbers.length() == charNumbers.length) return; 
        
        for(int i=0; i<charNumbers.length; i++){
            if(!isUse[i]){
                boolean[] chked = Arrays.copyOf(isUse,isUse.length);
                chked[i] = true;
                comb(numbers+charNumbers[i],charNumbers, chked, allCase);
            }
        }
    }
    
    boolean isPrime(int n){
        if(n == 0) return false;
        if(n == 1) return false;
        if(n == 2) return true;
        if(n > 2 && n%2 == 0) return false;
        
        for(int i=2; i<n; i++){
            if(n%i == 0) return false;            
        }
        return true;
    }
}