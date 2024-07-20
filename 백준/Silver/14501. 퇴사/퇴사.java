import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] days = new int[N+1][2];
        int[] D = new int[N+1];  // N일 차부터 일을 했을 때 벌 수 있는 돈이라고 정의, 최대값이 없다.
        
        for(int i=1; i<=N; i++){
            days[i][0] = sc.nextInt();
            days[i][1] = sc.nextInt();
            D[i] = 0;
        }
        
        for(int d=N; d>=1; d--){
            if(d + (days[d][0] - 1) > N){
                D[d] = 0;
            }else{
                D[d] += days[d][1];  
            }
            
            if(d + days[d][0] <= N){
                D[d] += D[d + days[d][0]];
            }
            
            if(days[d][0] > 1 && d+1 <= N){
                if(D[d+1] > D[d]) D[d] = D[d+1];
            }
        }
        System.out.println(D[1]);
    }
}



