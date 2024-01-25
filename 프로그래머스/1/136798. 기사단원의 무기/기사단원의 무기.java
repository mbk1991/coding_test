
class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            answer += getNumberOfDivNum(i, power, limit);
        }
        return answer;
    }
    
    public int getNumberOfDivNum(int n, int p, int l){       
        int numberOfDivNum = 2;
        if(n==1) return 1;
        
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                numberOfDivNum++;
            }
            if(numberOfDivNum > l) return p;
        }
        return numberOfDivNum;
    }
    
    
}