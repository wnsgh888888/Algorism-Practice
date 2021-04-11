package Programers;

import java.util.ArrayList;
import java.util.List;

public class Programers12 {
	
	public int[] solution(int[] arr) {
		
		if(arr.length <= 1) {
			int[] result = {-1};
			return result;
		}
		
		int minIndex = 0;
	
		for(int i=0; i<arr.length; i++) {
			if(arr[minIndex] > arr[i])
				minIndex = i;
		}
		
		List<Integer> li = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			li.add(arr[i]);
		}
		
		li.remove(minIndex);
		int[] result = new int[li.size()];
		
		for(int i=0; i<li.size(); i++) {
			result[i] = li.get(i);
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programers12 obj = new Programers12();
		
		int[] arr = {4,3,2,1};
		
		for (int i : obj.solution(arr)) {
			System.out.println(i);
		}
		
	}

}
//문제 설명
//정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
//단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
//예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
//
//제한 조건
//arr은 길이 1 이상인 배열입니다.
//인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

//sort => minIndex => val =>