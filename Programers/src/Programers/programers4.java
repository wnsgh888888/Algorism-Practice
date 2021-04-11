package Programers;

import java.util.Arrays;

public class programers4 {
	
	public static String[] solution (String [] strings, int n) {
		
		
		char [] tmp = new char[strings.length];
		
		for(int i=0; i<strings.length; i++) {
			tmp[i] = strings[i].charAt(n);
		}
		
		for(int i=0; i<strings.length; i++) {
			strings[i] = tmp[i] + strings[i];
		}
		
		Arrays.sort(strings);
		
		for(int i=0; i<strings.length; i++) {
			strings[i] = strings[i].substring(1);
		}
		
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"abce", "abcd", "cdx"};
		
		s = solution(s,1);
		
		for(String i : s) {
			System.out.println(i);
		}
		
	}

}

//문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
//각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
//예를 들어 strings가["sun","bed","car"]이고 
//n이 1이면 각 단어의 인덱스 1의 문자"u","e","a"로 strings를 정렬합니다.

//s.chatAt[n]을 char[]한 뒤 sort
