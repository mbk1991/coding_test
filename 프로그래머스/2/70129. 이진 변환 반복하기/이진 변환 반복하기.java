//231224 16:20
class Solution {
    public int[] solution(String s) {
        //0:횟수, 1:제거한 0의 개수
        int[] answer = new int[2];
        //s가 "1"이 될 때까지 반복
        while(!s.equals("1")){
            s = binaryFromLengthAddCnt( removeZeroAndAddCnt(s, answer) , answer);
            System.out.println(s);
        }
        return answer;
    }
    
    
    private String binaryFromLengthAddCnt(String s,int[] answer){
        s = String.valueOf(Integer.toBinaryString(s.length()));
        answer[0] ++;
        return s;
    }
    
    private String removeZeroAndAddCnt(String s, int[] answer){
        int beforeLength = s.length();
        s = s.replaceAll("0","");
        answer[1] += beforeLength - s.length();
        return s;
    }

}