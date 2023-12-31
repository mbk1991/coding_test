class Solution {
    public long solution(int n) {
        
        int before2 = 0;
        int before1=  1;
        int pibonacci = 0;
        for(int i=1; i<=n; i++){
            pibonacci = (before2+before1) % 1234567;
            before2 = before1 % 1234567;
            before1 = pibonacci % 1234567;
        }
        
        return pibonacci % 1234567;
    }
}



/*
231231
*/
// class Solution {
//     public long solution(int n) {
//         return pibonacci(n);
//     }
//     private int pibonacci(int n){
//         if(n == 1){
//             return 1;
//         }
//         if(n == 2){
//             return 2;
//         }
//         return (pibonacci(n-1) + pibonacci(n-2))   % 1234567;
//     }
// }


/*
231231 15:431
*/

// class Solution {
//     public long solution(int n) {
//         long answer = 0;
        
//         for(int i=0; i<= n/2; i++){
//             answer += (pactorial(n-i)/ (pactorial(n- 2*i)*pactorial(i)));
//         }
        
//         return answer%1234567;
//     }
    
//     private long pactorial(long n){
//         if(n==0) return 1;
//         for(long i=n-1; i>0; i--){
//             n *= i;
//         }
//         return n%1234567;
//     }
// }