import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        
        int chg = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]) chg++;
        }
        
        switch(chg){
            case 0: 
                answer = arr[0] * 1111;
                break;
            case 1:
                if(arr[1] == arr[2]){
                    if(arr[0] == arr[1]){
                        answer = (10 * arr[0] + arr[3]) * (10 * arr[0] + arr[3]);
                    }else{
                        answer = (10 * arr[3] + arr[0]) * (10 * arr[3] + arr[0]);
                    }
                }else{
                    answer = (arr[1]+arr[2]) * Math.abs(arr[1] - arr[2]);
                }
                break;
            case 2:  
                if(arr[0] == arr[1]){
                    answer = arr[2] * arr[3];
                }else if (arr[1] == arr[2]){
                    answer = arr[0] * arr[3];
                }else{
                    answer = arr[0] * arr[1];
                }
                break;
            case 3:  
                answer = arr[0];
                break;
        }
        return answer;
    }
}