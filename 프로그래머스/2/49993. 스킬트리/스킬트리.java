//가능한 스킬트리의 개수를 구하기
import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        String[] D = new String[skill_trees.length];
        
        for(int i=0; i<D.length; i++){
            D[i] =  removeOtherSkill(skill, skill_trees[i]);
        }
        // System.out.println(Arrays.toString(D));
        
        for(int i=0; i<D.length; i++){
            if(skill.indexOf(D[i]) == 0){
                answer ++;
            }
        }
        return answer;
    }
    
    
    String removeOtherSkill(String skill, String tree){
        return tree.replaceAll("[^"+ skill+"]", "");
    }
}