/**
차량별 주차 요금 계산
요금표
입/출차 기록
차량번호
출차가 없으면 23:59
기본 시간 이하라면 기본 요금
단위시간으로 나누어지지 않으면 올림

차량번호 오름차순으로 주차요금을 정수 배열에 담아 return

주차요금표 : 기본시간/ 기본요금/ 단위시간/ 단위요금

입차 : IN, 출차: OUT

주차 기록은 최대 1,000개

------
주차시간, 차량번호, 입/출차 를 어떤 자료로 다룰 것인가.
1) 맵으로 다룬다 키:차량번호, 값: 주차 시간 
2) 클래스로 다룬다.
3) 혼합한다.


- 필요 메서드
1) 시간 파싱
2) 시간 계산
3) 요금 계산

-필요 클래스
고객 클래스.
차량번호, 이용 시간, 히스토리(스택)을 갖는다.
고객은 리스트로 관리한다.

분할 
-입차 차량을 등록한다. (입차 처리) (입차한 차가 또 입차할 수는 없음) -> 입차 시간 기록해야함
-출차 시 해당 차량의 이용시간을 계산한다. (출차 처리) (출차한 차가 또 출차할 수는 없음)
-시간을 파싱한다. 00:00 ~ 23:59, 00:00 = 0, 23:59 = 1439
-장부 관리 (이용 차량 등록, 누적 시간 관리) Map<차량번호, 기록>
-출차하지 않은 차량은 23:59(1439) 를 출차 시간으로 간주한다.

기록이 선출차 후입차 처럼 역순으로 오는 경우도 있나? 혹시 모르니 시간순으로 정렬 후 처리해야하나? 정렬되어있음

*/
import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //장부 생성 키:차량번호, 값:주차기록객체
        Map<String, ParkHistory> parkHisList = new TreeMap<>();
        for(String record: records){
            String[] recordArr = record.split(" ");
            String time = recordArr[0];
            String carNo = recordArr[1];
            String his = recordArr[2];
            
            if(his.equals("IN")){
                //입차 처리
                if(!parkHisList.containsKey(carNo)){
                    //신규 입차
                    parkHisList.put(carNo, new ParkHistory(carNo, time));
                }else{
                    //재입차
                    parkHisList.get(carNo).rePark(time);
                }
                
            }else{
                //출차 처리
                parkHisList.get(carNo).outProcess(time);
            }
        }
        
        //영업 종료 후 미 출차 차량 처리
        for(String key : parkHisList.keySet()){
            if(parkHisList.get(key).isParking()){
                parkHisList.get(key).outProcess("23:59");
            }
        }
        //차량번호 별 오름차순 (트리맵)
        //차량 별 누적 이용시간을 이용한 요금 계산
        int[] answer = new int[parkHisList.size()];
        
        int idx = 0;
        for(String key: parkHisList.keySet()){
           answer[idx++] = parkHisList.get(key).getPay(fees[0], fees[1], fees[2], fees[3]);
        }
        
        
        return answer;
    }
}

class ParkHistory{
    private String carNo;
    private int inTime;
    private int accuTime;
    private boolean parkFlag;
    
    public ParkHistory(String carNo, String inTime){
        this.carNo = carNo;
        this.inTime = parseTime(inTime);
        this.parkFlag = true;
    }
    
    public void rePark(String inTime){
        this.inTime = parseTime(inTime);
         this.parkFlag = true;
    }
    
    public void outProcess(String rawOutTime){
        int outTime = parseTime(rawOutTime);
        this.accuTime += (outTime - inTime);
        this.parkFlag = false;
    }
    
    public int getInTime(){
        return this.inTime;
    }
    
    public int getAccuTime(){
        return this.accuTime;
    }
    
    private int parseTime(String rawTimeStr){
        String[] splitTime = rawTimeStr.split(":");
        String hour = splitTime[0];
        String min = splitTime[1];
        
        int time = 0;
        time += Integer.parseInt(hour) * 60;
        time += Integer.parseInt(min);

        return time;
    }
    
    public int getPay(int basicTime, int basicPay, int unitTime, int unitPay){
        int pay = 0;
        if(this.accuTime <= basicTime) return basicPay;
        pay = basicPay + (int)Math.ceil( (this.accuTime - (double)basicTime) / unitTime ) * unitPay;
        return pay;
    }
    
    public boolean isParking(){
        return this.parkFlag;
    }
    
    public String toString(){
        return this.carNo + "/" + this.inTime + "/" + this.accuTime;
    }
    
}
