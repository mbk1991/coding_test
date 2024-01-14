class Solution {
    public int solution(int a, int b) {
        int gcd = getGCD(a,b);
        int x = b/gcd;

        while(x > 1){
            if(x%2 == 0){
                x /= 2;
            }else{
                if(x%5 == 0){
                    x /= 5;
                }else{
                    return 2;
                }
            }
        }
        return 1;
    }
    
    private int getGCD(int a, int b){
        int big = (a>b)? a:b;
        int small = (a<b)? a:b;
        int r = big%small;
        while(r>0){
            big = small;
            small = r;
            r = big%small;
            if(r == 0){
                return small;
            }
        }
        return small;
    }
}