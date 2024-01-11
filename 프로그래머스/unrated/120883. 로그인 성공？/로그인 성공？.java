class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        boolean idPass = false;
        boolean pwPass = false;
        
        for(String[] data:db){
            if(id_pw[0].equals(data[0])){
                idPass = true;
                if(id_pw[1].equals(data[1])){
                    pwPass = true;
                    break;
                }
            }
        }
        
        if(idPass & pwPass) answer          = "login";
        else if(idPass ^ pwPass) answer     = "wrong pw";
        else if(!(idPass | pwPass)) answer  = "fail";
        
        return answer;
    }
}