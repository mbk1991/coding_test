class Solution {
    public int solution(int n) {
        return n + skipThreeCnt(n);
    }
    
    private int skipThreeCnt(int n){
        int cnt = 0;
        for(int i=1; i<=n; i++){
            while(((i+cnt+"").contains("3") || (i+cnt)%3 == 0)) cnt ++;
        }
        return cnt;
    }
}