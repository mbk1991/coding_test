//231229 20:59
/*
1. 정렬한다.
2. 두 개의 포인터를 이용 , 가벼운자, 무거운자
3. 무거운자 인덱스 < 가벼운자 인덱스 조건 시 반복
   1인 탑승 조건
     1)가벼운자와의 무게 합이 무게 제한을 초과
    -> 1인 탑승 시 무거운자 인덱스 --; 보트수 ++; (인덱스의 이동은 사람을 태워보내는 것을 의미)
   2인 탑승 조건
     1) 1인 탑승 조건이 아님
     2) 가벼운자와 무거운자의 무게 합이 무게 제한 이하
     -> 가벼운자 인덱스++; 무거운자 인덱스--; 보트수 ++;
4. 남은 사람중 가장 가벼운 자와 몸무게 합이 무게제한을 초과하는 무거운자 컷
*/

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int numberOfBoat = 0;
        int heaviest = people.length-1;
        int lightest = 0;
        
        Arrays.sort(people);
        
        while(heaviest >= lightest){
            if(heaviest == lightest){
                numberOfBoat ++;
                break;
            }
            if((people[heaviest] + people[lightest]) > limit){
                heaviest --;
                numberOfBoat ++;
            }else{
                heaviest --;
                lightest ++;
                numberOfBoat ++;
            }
        }
        return numberOfBoat;
    }
}