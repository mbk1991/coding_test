/*
1. 4가지 발음을 숫자로 치환
2. replaceAll 후 문자가 남아있으면 x
3. 같은 숫자가 연속되면 x

*/

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String s:babbling){
            
            s = s.replaceAll("aya"  ,"1");
            s = s.replaceAll("ye"   ,"2");
            s = s.replaceAll("woo"  ,"3");
            s = s.replaceAll("ma"   ,"4");
            
            System.out.println(s);
            
            if(s.matches("[1-4]*")){
                
                if(s.contains("11")) continue;
                if(s.contains("22")) continue;
                if(s.contains("33")) continue;
                if(s.contains("44")) continue;
                
                answer++;
            }
        }
        return answer;
    }
}



// class Solution {
//     public int solution(String[] babbling) {
//         int answer = 0;
        
//         for(String s:babbling){
            
//             s = s.replaceAll("aya"  ,"1");
//             s = s.replaceAll("ye"   ,"2");
//             s = s.replaceAll("woo"  ,"3");
//             s = s.replaceAll("ma"   ,"4");
            
//             if(s.matches("[1-4]*") && !s.matches("1{2,}|2{2,}|3{2,}|4{2,}")){
//                 answer++;
//             }
//         }
//         return answer;
//     }
// }