import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numbers = sc.next();
        char[] charArr = numbers.toCharArray();
        
        int answer = 0;
        for(char c:charArr){
            answer += c-'0';
        }
        
        System.out.println(answer);
  }  
}