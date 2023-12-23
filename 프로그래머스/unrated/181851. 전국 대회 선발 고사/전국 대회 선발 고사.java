class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        
        //index가 학생 랭크인 students 배열 선언
        //불참 학생은 MAX_VALUE로 처리
        int[] students = new int[rank.length];
        for(int i=0; i<students.length; i++){
            if(attendance[i]){
                students[rank[i]-1] = i;
             }else{
                students[rank[i]-1] = Integer.MAX_VALUE;
            }
        }
        
        //cnt를 개수로 answer를 계산
        int answer = 0;
        int cnt = 10000;
        for(int student:students){
            if(student != Integer.MAX_VALUE){
                answer += student*cnt;
                cnt/=100;
                if(cnt == 0) break;
            }
        }
        return answer;
    }
}