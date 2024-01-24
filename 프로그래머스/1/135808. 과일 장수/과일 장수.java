/*
오름차순으로 정렬한다.
버릴 사과가 있는 경우 점수가 낮은 사과부터 버린다. (나머지 연산)
몇 상자인지 계산한다 (몫 연산) 0상자인 경우 0을 반환한다.
0번인덱스, m번인덱스, 2m번 인덱스, 3m번 인덱스 가 각각 최저 점수이다.
최저점수 * 한 상자에 들어가는 사과 개수를 계산한다.
*/

import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    public int solution(int k, int m, int[] score) {
        AtomicInteger ai = new AtomicInteger();
        return IntStream.of(score).sorted().skip(score.length%m).filter(i->ai.getAndIncrement() % m == 0).sum()*m;
    }
}