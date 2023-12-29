//231229 20:28
/*
n이 a*2의 제곱수 + b*2의 제곱수 + ... + x 로 표현될 때
2의 제곱수인 경우 1로 취급하고
나머지인 x를 더하면?

n에서 n보다 작은 최대 2의 제곱수를 빼는 횟수 + 나머지
*/

import java.util.*;

public class Solution {
    public int solution(int n) {
        
        int cnt = 0;
        while(n > 1){
            n -= getMaxPowerTwoUnderN(n);    
            cnt++;
        }
        return cnt + n;
    }
    private int getMaxPowerTwoUnderN(int n){
        int powerTwo = 2;
        while(powerTwo <= n){
            powerTwo *= 2;
        }
        return powerTwo/2;
    }
}