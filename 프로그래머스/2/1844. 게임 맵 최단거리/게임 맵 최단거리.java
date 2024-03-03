import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        boolean[][] isVisit = new boolean[maps.length][maps[0].length];
        int answer = 0;
    
        Queue<Position> pQueue = new LinkedList<>();
        pQueue.offer(new Position(0,0,1));
        isVisit[0][0] = true;
        
        int[] dx = {0,0,-1,1}; //상,하,좌,우
        int[] dy = {-1,1,0,0};
        
        while(!pQueue.isEmpty()){
            Position p = pQueue.poll();     
            
            if(p.chkPosition(maps[0].length-1, maps.length-1)){
                return p.n;
            }
            
            
            for(int i=0; i<=3; i++){
                int ny = p.y+dy[i];
                int nx = p.x+dx[i];
                
                if(ny < 0 || ny >= maps.length) continue;
                if(nx < 0 || nx >= maps[0].length) continue;
                if(isVisit[ny][nx]) continue;
                if(maps[ny][nx] == 0) continue;
                
                pQueue.offer(new Position(nx,ny,p.n+1));
                isVisit[ny][nx] = true;
            }
        }
        
        return -1;
    }
}

class Position{
    int x;
    int y;
    int n;
    
    public Position(int x, int y, int n){
        this.x = x;
        this.y = y;
        this.n = n;
    }
    
    public boolean chkPosition(int currX, int currY){
        if(this.x == currX && this.y ==  currY){
            return true;
        }
        return false;
    }
}