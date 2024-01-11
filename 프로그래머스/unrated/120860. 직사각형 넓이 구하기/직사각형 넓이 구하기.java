/*
각 꼭지점의 순서에 대한 언급은 없으므로
큰 값과 작은 값을 구분할 필요가 있다.
*/


class Solution {
    public int solution(int[][] dots) {
        int bigX    = dots[0][0];
        int smallX  = dots[0][0];
        int bigY    = dots[0][1];
        int smallY  = dots[0][1];
        
        for(int i=1;i<dots.length; i++){
            bigX    = (bigX < dots[i][0])? dots[i][0]:bigX;
            smallX  = (smallX > dots[i][0])? dots[i][0]:smallX;
            bigY    = (bigY < dots[i][1])? dots[i][1]:bigY;
            smallY  = (smallY > dots[i][1])? dots[i][1]:smallY;
        }
        
        System.out.println(bigX);
        System.out.println(smallX);
        System.out.println(bigY);
        System.out.println(smallY);
        
        return (bigX-smallX)*(bigY-smallY);
    }
}