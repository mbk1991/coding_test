/*
20240105 23:25

행렬의 곱 n*m 행렬 * m*k 행렬 = n*k행렬

k <= 0 to (n-1)
sum(arr1(i,k) * arr2(k,j))

*/

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int arr1_row            = arr1.length;
        int arr1_col            = arr1[0].length;
        int arr2_col            = arr2[0].length;
        
        int[][] answer = new int[arr1_row][arr2_col];
        for(int i=0; i<arr1_row; i++){
            for(int j=0; j<arr2_col; j++){
                int sum=0;
                for(int k=0; k<arr1_col; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}