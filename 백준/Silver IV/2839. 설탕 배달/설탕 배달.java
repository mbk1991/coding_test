import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = -1;

        if(N%5 ==0){
            answer = N/5;
        }else{
            for(int i=N/5; i>=0; i--){
                if((N-5*i)%3 == 0){
                    answer = i + (N-5*i)/3;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}