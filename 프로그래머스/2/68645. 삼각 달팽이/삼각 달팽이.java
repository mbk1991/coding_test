import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int[][] arr = new int[n][n];
        int goal = getSumN(n);
        int[]dx = {0, 1, -1}; // 0:down, 1:right, 2:upleft
        int[]dy = {1, 0, -1};
        
        int currX = 0;
        int currY = 0;
        int direction = 0;
        
        for(int i=1; i<=goal; i++){
            if(currX ==n || currY == n) break;
            arr[currY][currX] = i;
            switch(direction){
                case 0: 
                    if((currY == n-1) || arr[currY + dy[direction]][currX + dx[direction]] != 0){
                        direction = ++direction%3;
                    }
                    break;
                case 1: 
                    if((currX == n-1) || arr[currY + dy[direction]][currX + dx[direction]] != 0){
                         direction = ++direction%3;
                    }
                    break;
                case 2:
                    if((currY == 0) || (currX == 0)|| arr[currY + dy[direction]][currX + dx[direction]] != 0){
                        direction = ++direction%3;
                    }
                    break;
                }
            currX += dx[direction];
            currY += dy[direction];
        }
        
        List<Integer> list = new ArrayList<>();
        for(int[] a:arr){
            for(int i:a){
                if(i == 0) continue;
                list.add(i);
            }
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
    
    int getSumN(int n){
        int sum = 0;
        while(0 < n){
            sum += n;
            n --;
        }
        return sum;
    }
}