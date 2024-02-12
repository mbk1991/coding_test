import java.util.stream.*;

class Solution {
    public int[] solution(int num, int total) {
        
        int x = (total - ((num-1)*(num)/2)) / num;
        return IntStream.range(x,x+num).toArray();
    }
}