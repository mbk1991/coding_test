/**
가장 짧은 변환 과정, 최단 거리라고 생각해도 될까.
최단거리라면 너비 우선 탐색을 사용해본다.

[종료 조건]
-target 단어와 같아지거나
-변환할 수 있는 모든 단어를 탐색한 경우

[주의 사항]
-같은 루트에서 이미 변환에 사용했던 단어는 사용하지 않는다.(순환될것이므로, 그리고 다른 루트에서 이미 변환에 사용한 루트로 가는 것은 최단 거리가 아니므로)

[수도코드]
0. target과 일치하는 것을 판단하는 플래그 flag를 false로 선언한다.
1. begin을 큐에 삽입하고 방문처리 한다.
2. while(큐가 비어있지 않다면)
     2.1. 큐를 offer한다. (트리의 레벨은 어떻게 판단하지?)
     2.2. 변환 가능한 워드를 target과 같은지 검사한다. 같은 경우 flag를 true로 변경하고 break한다.
     2.3. 변환 가능한 워드를 방문처리하고 큐에 삽입한다. *변환 가능한 워드 = 비방문, 한글자 차이인 경우
     2.2. 
3. 반복문이 종료되었는데 flag가 false인 경우 0을 반환한다.
**/

import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] isVisit = new boolean[words.length];
        boolean targetSearch = false;
        int level = -1;
        Queue<String> queue = new LinkedList<>();
        
        queue.offer(begin);
        
        while(! queue.isEmpty()){
            
            int size = queue.size();
            
            for(int i=0; i<size; i++){
                
               String word = queue.poll();

                //target과 같다면 종료
                if(word.equals(target)){
                    targetSearch = true;
                    break;
                }

                //변환 가능한 word 큐에 추가
                for(int j=0; j<words.length; j++){
                    if(!isVisit[j]){
                        if(isConvertable(word, words[j])){
                            isVisit[j] = true;
                            queue.offer(words[j]);
                        }
                    }
                }
            }
            level++;
        }
        return targetSearch? level : 0;
    }
    
    public boolean isConvertable(String word1, String word2){
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        
        int cnt = 0;
        for(int i=0; i<char1.length; i++){
            if(char1[i] != char2[i]){
                cnt++;
            }   
        }
        return (cnt == 1)? true : false;
    }
}