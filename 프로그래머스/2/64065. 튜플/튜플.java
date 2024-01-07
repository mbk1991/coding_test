/*
20240107 22:57
어떤 자료구조에 담는 것이 효율적일까
배열, 해시맵, 트리맵, 어레이리스트, 링크드리스트, 스택, 큐, 뎈, 투포인터

싹돌면서 가장 많이 등장한 순으로 넣어주면 된다.
맵을쓴다.

*/

import java.util.*;

class Solution {
    public int[] solution(String s) {
        Map<Integer,Integer> map = new HashMap<>();
        
        String[] strArr = s.split("[{},]");
        for(int i=0; i<strArr.length; i++){
            if(!strArr[i].equals("")){
                int n = Integer.parseInt(strArr[i]);
                if(!map.containsKey(n)){
                    map.put(n,0);                                    
                }else{
                    map.put(n, map.get(n) + 1);
                }
            }
        }
        
        int[] answer = new int[map.size()];
        for(int i: map.keySet()){
            answer[answer.length - 1 - map.get(i)]  = i;
        }
        return answer;
    }
}