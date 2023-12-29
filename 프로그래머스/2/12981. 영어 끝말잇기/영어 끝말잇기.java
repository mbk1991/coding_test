/**
20231229 07:54
1. 1~n 번 사람이 돌아가며 반복
2. 탈락조건
 1) 앞에 나온 단어 사용
 2) 앞사람의 마지막 문자로 시작하는 단어 미사용
 3) 한 글자 단어 사용
3. 탈락자가 있을 경우 탈락자의 번호와 차례 리턴
   탈락자가 없을 경우 0,0 리턴
=>탈락 조건이 몇번째 문자에서 발생하는지 확인
   번호 = 인덱스 % 인원수 + 1
   차례 = 인덱스 / 번호
=>순회 후 탈락 조건이 없으면 0,0 리턴
**/
import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> checkSet = new HashSet<>();
        int beforeSize = 0;
        char endChar = ' ';
        int i;
        for(i=0; i<words.length; i++){
            String word = words[i];
            if(word.length() <= 1){
                //한글자 탈락
                System.out.println("한글자 탈락");
                break;
            }
            System.out.println(endChar + " " + word.charAt(0));
            
            
            if(i > 0 &&word.charAt(0) != endChar){
                //끝 단어 불일치 탈락
                System.out.println("끝 단어 불일치 탈락");
                break;
            }
            endChar = word.charAt(word.length()-1);
            
            
            checkSet.add(word);
            if(checkSet.size() == beforeSize){
                //중복 단어 탈락
                System.out.println("중복 단어 탈락");
                break;
            }
            beforeSize = checkSet.size();
        }
        System.out.println(i);
        
        if(i < words.length){
            answer[0] = i % n + 1;
            answer[1] = i/n + 1 ;
        }else{
             //탈락자 없음
            answer[0] = 0;
            answer[1] = 0;
        }
        return answer;
    }
    
}