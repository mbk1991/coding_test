import java.util.*;

 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         int M = sc.nextInt();

         int[][] matrix = new int[N][M];
         for(int raw=0; raw<N; raw++){
             for( int col=0; col<M; col++ ){
                 matrix[raw][col] = sc.nextInt();
             }
         }

         for(int raw=0; raw<N; raw++){
              for( int col=0; col<M; col++ ){
                  matrix[raw][col] += sc.nextInt();
                  System.out.print(matrix[raw][col] + " ");
              }
              System.out.println();
          }

     }
 }