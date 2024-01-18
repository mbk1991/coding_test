class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] split = polynomial.split(" ");
        
        int x=0;
        int con=0;
        
        for(String s:split){
            if(s.equals("+")) continue;
            if(s.contains("x")){
                if(s.equals("x")){
                    x += 1;
                }else{
                    x += Integer.parseInt(s.replace("x",""));
                }
                
            }else{
                con += Integer.parseInt(s);
            }
        }
        
        if(x==0){
            if(con != 0){
                answer =  con+"";
            }else{
                answer = "";
            }
        }else if(x==1){
            if(con != 0){
                answer =  "x" + " + " + con;
            }else{
                answer = "x";
            }
        }else{
            if(con != 0){
                answer =  x+"x" + " + " + con;
            }else{
                answer = x+"x";
            }            
        }
        
        return answer;
    }
}