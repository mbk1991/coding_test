//엣지리스트로 표현해보기 : 출발지,도착지
//엣지리스트 방문 기록하기
//지나갔던 엣지는 카운트하지 않기
import java.util.*;


class Solution {
    //history
    List<Edge> edgeList = new ArrayList<>();
    
    public int solution(String dirs) {
        int answer = 0;
        
        
        int tmpX = 0;
        int tmpY = 0;
        for(String dir:dirs.split("")){
            
            Edge e = new Edge();
            e.setStartPoint(tmpX, tmpY);
            e.setDstPoint(dir);
            
            if(e.sX == e.dX && e.sY == e.dY) continue;
            

            
            System.out.println(e.toString());
            
            
            
            if(!edgeList.contains(e)){
                edgeList.add(e);
            }
            
            tmpX = e.dX;
            tmpY = e.dY;
        }
        
        answer = edgeList.size();
        return answer;
    }
}

class Edge{
    //U,D,R,L
    int[] moveX = {0,0,1,-1};
    int[] moveY = {1,-1,0,0};
    
    public int sX;
    public int dX;
    public int sY;
    public int dY;
    
    public void setStartPoint(int sX, int sY){
        this.sX = sX;
        this.sY = sY;
        
    }
    
    public void setDstPoint(int dX, int dY){
        this.dX = dX;
        this.dY = dY;
        
    }
    
    public void setDstPoint(String dir){
        
        if(dir.equals("U")){
            this.dX = this.sX + this.moveX[0];
            this.dY = this.sY + this.moveY[0];
        }else if(dir.equals("D")){
            this.dX = this.sX + this.moveX[1];
            this.dY = this.sY + this.moveY[1];
        }else if(dir.equals("R")){
            this.dX = this.sX + this.moveX[2];
            this.dY = this.sY + this.moveY[2];
        }else if(dir.equals("L")){
            this.dX = this.sX + this.moveX[3];
            this.dY = this.sY + this.moveY[3];
        }else{
            //no dir
        }
        
        if(this.dX > 5) this.dX = 5;
        if(this.dX < -5) this.dX = -5;
        if(this.dY > 5) this.dY = 5;
        if(this.dY < -5) this.dY = -5;
        
    }
    
    @Override
     public boolean equals(Object o){
        Edge other = (Edge) o;
         
        if(this.sX == other.sX && this.sY == other.sY && 
           this.dX == other.dX && this.dY == other.dY) return true;
        
        if(this.sX == other.dX && this.sY == other.dY &&
           this.dX == other.sX && this.dY == other.sY) return true;
        
        return false;
    }
    
    @Override
    public String toString(){
        return String.format("sX:%s, sY:%s, dX:%s, dY:%s",sX, sY, dX, dY);
    }
    
    
    
}