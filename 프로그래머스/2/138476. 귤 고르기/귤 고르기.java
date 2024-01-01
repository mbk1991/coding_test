/*
240101 23:00
중복이 많은 사이즈 순으로 k개를 선택하면서 몇 종류인지 체크하는 방법?
생각나는 방법은
10000001 사이즈의 배열을 만들고
배열의 인덱스가 사이즈라고 생각하고
tangerine 배열을 1회 순회화면서 나오는 사이즈의 인덱스를 ++한다.
하지만 사이즈의 개수가 많은 순으로 정렬하기 힘들다.
맵 자료구조를 사용하여
키: 사이즈
값: 개수
로 세팅한다.
treemap 을 사용하여  key의 순서를?
또는 entry를 정렬하여 key 많은순서로?
*/
import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
       
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            if(map.get(tangerine[i]) == null){
                map.put(tangerine[i], 1);    
            }else{
                map.put(tangerine[i], map.get(tangerine[i]) + 1);
            }
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2){
                return o2.getValue() - o1.getValue();
            }
        });
        
        int answer = 0;
        for(Map.Entry<Integer,Integer> e : list){
            answer ++;            
            k -= e.getValue();
            if (k<=0){
                break;
            }
        }
        return answer;
    }
}