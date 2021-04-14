package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Programers24 {
	
	public int[] solution(int[] answer) {
		
		int[] user1 = {1,2,3,4,5};
		int[] user2 = {2,1,2,3,2,4,2,5};
		int[] user3 = {3,3,1,1,2,2,4,4,5,5};
		
		int score1 = 0, score2 = 0, score3 =0;
		
		for(int i=0; i<answer.length; i++) {
			if(answer[i] == user1[i%5]) score1++;
			if(answer[i] == user2[i%8]) score2++;
			if(answer[i] == user3[i%10]) score3++;
		}
		
		int max = Math.max( (Math.max(score1,score2)), score3);
		List<Integer> tmp = new ArrayList<>();	
		
		if(max == score1) tmp.add(1);
		if(max == score2) tmp.add(2);
		if(max == score3) tmp.add(3);
		
		int[] result = new int[tmp.size()];
		
		for(int i=0; i<result.length; i++) {
			result[i] = tmp.get(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		
		
			System.out.println(5%5);
		
		
	}

}
//문제 설명
//수포자는 수학을 포기한 사람의 준말입니다.
//수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
//가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
//
//제한 조건
//시험은 최대 10,000 문제로 구성되어있습니다.
//문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
//가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

//1 => 1~5 => {1,2,3,4,5}
//2 => 2(1)2(3)2(4)2(5) => {2,1,2,3,2,4,2,5}
//3 => 33 11 22 44 55 => {3,3,1,1,2,2,4,4,5,5}

// arr[i % 3] => [arr] 0 1 2 3 / 0 1 2 3 / ...