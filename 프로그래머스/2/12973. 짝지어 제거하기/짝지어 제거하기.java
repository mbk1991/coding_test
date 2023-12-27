import java.util.*;

//231226 23:31
class Solution{
    public int solution(String s){
        
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        
        for(char c : arr){
            if(!st.empty() && st.peek() == c){
                st.pop();
                continue;
            }else{
                st.push(c);    
            }
        }
        return st.empty()? 1 : 0;
    }
}


//231226 23:31  케이스 일부 통과 못함.
// class Solution{
//     public int solution(String s){
//         char[] arr = s.toCharArray();
//         if(arr.length % 2 == 1){return 0;}
        
//         int gap = 1;
//         int pairIdx = 1;  
//         while(pairIdx < arr.length){
//             A:
//             for(int i=0; i+pairIdx<arr.length;i++){
//                 if(arr[i] != '0' && arr[i] == arr[i + pairIdx]){
//                     for(int j=i+1; j<i+pairIdx; j++){
//                         if(arr[j] != '0'){
//                             break A;
//                         }
//                     }
//                     arr[i] = 0;
//                     arr[i + pairIdx] = 0;
//                 }
//             }
//             gap *= 2;
//             pairIdx = gap + 1;
//         }
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] != 0){
//                 return 0;
//             }
//         }
//         return 1;
//     }
// }



//231226 23:31 지옥의 성능
// class Solution{
//     public int solution(String s){
//         int answer = 1;
            
//         while(!s.equals("")){
//             String tmp = s;
//             s = removePair(s);
            
//             System.out.println(tmp);
//             System.out.println(s);
            
//             if(tmp.equals(s)){
//                 return 0;
//             }
//         }        

//         return answer;
//     }
//     private String removePair(String s){     
//         return s.replaceAll("aa|bb|cc|dd|ee|ff|gg|hh|ii|jj|kk|ll|mm|nn|oo|pp|qq|rr|ss|tt|uu|vv|ww|xx|yy|zz","");
//     }
// }