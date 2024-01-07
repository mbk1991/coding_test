/*
20240107 12:08
*/
import java.util.*;

class Solution {
    private Deque<String> cache = new LinkedList<>();
    private int currCacheSize = 0;
    
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        
        for(String city: cities){
            // System.out.print(city);
            
            if(cache.contains(city.toLowerCase())){
                // System.out.println(":캐시히트");
                answer += 1;
                reCache(city);
            }else{
                // System.out.println(":캐시미스");
                answer += 5;
                addCache(cacheSize, city);
            }
        }
        return answer;
    }
    private void addCache(int cacheSize, String city){
        if(currCacheSize<cacheSize){
           cache.addFirst(city.toLowerCase());       
           currCacheSize++;
        }else{
           cache.addFirst(city.toLowerCase());
           cache.pollLast();
        }
        
    }
    private void reCache(String city){
        String tmp = city.toLowerCase();
        cache.remove(tmp);
        cache.addFirst(tmp);
    }
}
