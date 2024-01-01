/*
240102 07:41
나머지 연산을 이용해서 배열을 돈다
0,1,2,3,4                       => for i for i to j&i
01,12,23,34,41                  
012,123,234,340,412
0123,1234,2340,3401,4012
01234,12340,23401,34012,40123
*/
import java.util.*;

class Solution {
    public int solution(int[] elements) {
        
        Set<Integer> set = new HashSet<>();
        A:
        for(int i=1; i<=elements.length; i++){
            for(int j=0; j<elements.length; j++){
                             
                
                int tmp = 0;
              
                for(int k=j; k<j+i; k++){
                    tmp += elements[k%elements.length];
                }
                set.add(tmp);
                if(i == elements.length){
                    break A;    
                }
                
                
            }
        }
        
        return set.size();
    }
}