package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programers21 {
	
	public int[] solution(int[] numbers) {
		
		List<Integer> tmp = new ArrayList<>();
		int len = numbers.length;
		int k = 0;
		
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				k = numbers[i] + numbers[j];
				if(!tmp.contains(k))
					tmp.add(k);
			}
		}
		
		int[] result = new int[tmp.size()];
		
		for(int i=0; i<tmp.size(); i++) {
			result[i] = tmp.get(i);
		}
		
		Arrays.sort(result);
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//문제 설명
//정수 배열 numbers가 주어집니다. 
//numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를
//배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//numbers의 길이는 2 이상 100 이하입니다.
//numbers의 모든 수는 0 이상 100 이하입니다.