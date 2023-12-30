/*
231230 11:48
a와 b가 몇 번 째 라운드에서 만나는지

1,2,3,4,5,6,7,8
1,2,3,4
1,2

1) N번 또는 N-1 번은 승리 시 다음라운드에서 N/2번이 된다.
2) 한 라운드 단위로 반복한다
  -a의 다음라운드 번호, b의 다음라운드 번호를 구한다.
  -a, b중 큰 수가 2의 배수이고 큰 수 - 1 이 작은 수 일 때 a와 b가 맞붙는다고 판단한다. 
  -라운드 번호를 반환
*/
class Solution{
    public int solution(int n, int a, int b){
        int round = 1;
        
        while(  !(1 == ( (a>b)?((a%2==0)?a-b: 0 ) : ((b%2==0)? b-a: 0 ))) ){
            a = (a%2==1)? (a+1)/2 : a/2;
            b = (b%2==1)? (b+1)/2 : b/2;
            
            // System.out.println(a + " : " + b);  
            round ++;
            // System.out.println(round);
        } 
        
        return round;
    }
}