class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int service = 0;
        while(coupon >= 10){
            int s = coupon / 10;
            answer += s;
            coupon -= s * 10;
            coupon += s;
        }
        
        return answer;
    }
}