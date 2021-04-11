package Programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programers7 {
	
	public int[] solution(int[] arr,int div) {
		
		List<Integer> li = new ArrayList<>();
		
		for(int i : arr) {
			if(i % div == 0) 
				li.add(i); 
		}
		
		if(li.size() == 0)
			li.add(-1);
		
		Collections.sort(li);
		
		int[] result = new int[li.size()];
		
		for(int i=0; i<li.size(); i++) {
			result[i] = li.get(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		int n =2;
		
		Programers7 obj = new Programers7();
		int[] newarr = obj.solution(arr, 2);
		
		for (int i : newarr) {
			System.out.println(i);
		}
	}

}
//문제 설명
//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
//
//제한사항
//arr은 자연수를 담은 배열입니다.
//정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
//divisor는 자연수입니다.
//array는 길이 1 이상인 배열입니다.

//배열값을 div로 나눈 값이 0인 수들을 모아 오름차순 정렬
//단 그 수들이 없으면 -1 넣어줌
//베열과 div는 모두 자연수