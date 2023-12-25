//231225 11:23, 1차 시도 시간 초과
class Solution {
    public int solution(int n) {
        int answer = searchBiggerN(n);
        return answer;
    }
    
    private int searchBiggerN(int n){
        int countOneOfN = countOneOfBinary(n);
        for(int i=n+1;;i++){
            if(countOneOfBinary(i) == countOneOfN){
                return i;
            }
        }
    }
    
    private int countOneOfBinary(int n){
        int cnt=0;
        for(int i=n;i>1;){
            cnt += i%2;
            i = i/2;
        }
        return cnt+1;
    }
}

// //1차 시도 시간초과
// class Solution {
//     public int solution(int n) {
//         int answer = searchBiggerN(n);
//         return answer;
//     }
    
//     private int searchBiggerN(int n){
//         int countOneOfN = countOneOfBinary(n);
//         for(int i=n+1;;i++){
//             if(countOneOfBinary(i) == countOneOfN){
//                 return i;
//             }
//         }
//     }
    
//     private int countOneOfBinary(int n){
//         String binaryN = Integer.toBinaryString(n);
//         return binaryN.length() - binaryN.replaceAll("1","").length();
//     }
// }

// //Integer의 bitCount()메서드 사용 시
// class Solution {
//     public int solution(int n) {
//         int answer = searchBiggerN(n);
//         return answer;
//     }
    
//     private int searchBiggerN(int n){
//         int countOneOfN = Integer.bitCount(n);
//         for(int i=n+1;;i++){
//             if(Integer.bitCount(i) == countOneOfN){
//                 return i;
//             }
//         }
//     }

// }


