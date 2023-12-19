class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int currentHealth = health;              //현재 체력 초기화
        int successCnt = 0;                     //붕대감기 성공 횟수
        int healingCompleteTime = bandage[0];   //붕대감기 시전 시간
        int healingPerSecond = bandage[1];      //붕대감기 초당 회복량
        int healingBonus = bandage[2];          //붕대감기 성공 회복량
        int finalAttackSecond = attacks[attacks.length-1][0]; //마지막 공격 시간
        
        int attackIndex = 0;                        //공격 Index
        int attackedTime = attacks[attackIndex][0];    //공격받는 시간
        int attackedDamage = attacks[attackIndex][1];  //공격 데미지
        
        
        //0초부터 몬스터의 최후 공격까지 반복한다.
        for(int second = 0; second <= finalAttackSecond; second++){
            System.out.println("#####");
            System.out.println("시간: " + second);
            System.out.println("최대 체력: " + health);
            System.out.println("현재 체력: " + currentHealth);
           
            
            if(second == attackedTime){
                //공격 받음
                System.out.println("몬스터에게 공격받음!  데미지 : " + attackedDamage);
                currentHealth -= attackedDamage;
                if(currentHealth <= 0){
                    return -1;
                }
                successCnt = 0; // 붕대감기 초기화됨
                //다음 공격 정보로 초기화
                attackIndex++;
                if(attackIndex >= attacks.length-1) attackIndex = attacks.length-1;
                attackedTime = attacks[attackIndex][0];
                attackedDamage = attacks[attackIndex][1];
                continue; //공격받은 시간에는 붕대 감기가 실행되지 않음
            }
            
            //공격받지 않은 시간에는 붕대감기가 실행됨
            currentHealth += healingPerSecond;
            //붕대감기 성공 ++
            successCnt++;
            System.out.println("붕대감기 성공!! 붕대감기 성공 카운트 : " + successCnt);
            System.out.println("붕대감기 성공!! 체력 회복 : " + healingPerSecond);
            //붕대감기 추가회복
            if(healingCompleteTime == successCnt){
                currentHealth += healingBonus;
                successCnt = 0;               
                System.out.println("붕대감기 추가회복 성공!! 추가 체력 회복 : " + healingBonus);
            }
            if(currentHealth >= health) currentHealth = health;
        }
        return currentHealth;
    }
}