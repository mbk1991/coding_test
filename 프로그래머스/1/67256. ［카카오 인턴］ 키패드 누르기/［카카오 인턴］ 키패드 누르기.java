class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        
        int left =10;
        int right = 12;
        int leftDistance = 0;
        int rightDistance = 0;        
        for (int num: numbers){
            if(num==0){
                num=11;
            }
            if(num== 1|num==4|num==7){
                left = num;
                answer += "L";
            }
            if(num==3|num==6|num==9){
                right = num;
                answer += "R";
            }
            if(num==2|num==5|num==8|num==11){
                leftDistance = ((Math.abs(num-left))/3) +((Math.abs(num-left))%3);
                rightDistance = ((Math.abs(num-right))/3) +((Math.abs(num-right))%3);
            
                if(leftDistance<rightDistance){
                   answer += "L";
                   left = num;
                }else if(leftDistance>rightDistance){
                   answer += "R"; 
                   right = num;
                }else if(leftDistance==rightDistance){
                   answer += hand.toUpperCase().charAt(0);
                    if(hand.equals("right")){
                        right = num;
                    }
                    if(hand.equals("left")){
                        left = num;
                    }
                }
            }         
        }
             
        
        return answer;
    }
}