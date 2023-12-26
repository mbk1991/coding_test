//121226 22:39
class Solution {
    public int solution(int n) {
        
        //61만 넘어도어도 Integer를 초과한다.
        // System.out.println(fibonacci(61)); //764848393
        
        return fibonacci(n) % 1234567;
    }
    
    private int fibonacci(int n){
         int fibonacciNumber = 0;
        
        if( n == 0){
            return 0;
        }else if( n == 1){
            return 1;
        }else{
            
            int n1 = 0;
            int n2 = 1;
            int tmp;
            
            for(int i=3; i<= n; i++){
                tmp = n2 % 1234567;
                n2 = (n1 + n2) % 1234567;
                n1 = tmp % 1234567;
            }
            fibonacciNumber = (n1 + n2) % 1234567;
        }
        
        return fibonacciNumber;
    }
}


//121226 22:39 재귀 사용 시 시간 초과
// class Solution {
//     public int solution(int n) {
//         return fibonacci(n) % 1234567;
//     }
    
//     private int fibonacci(int n){
//         if(n == 0){
//             return 0;
//         }else if(n == 1){
//             return 1;
//         }
        
//         return fibonacci(n-1) + fibonacci(n-2);
        
//     }
// }