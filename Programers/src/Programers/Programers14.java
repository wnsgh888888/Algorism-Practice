package Programers;

import java.util.Arrays;

public class Programers14 {
	
    public long solution(long n) {
    	char[] ch = Long.toString(n).toCharArray();
    	Arrays.sort(ch);
    	char tmp = ' ';
    	
    	for(int i=0; i<ch.length/2; i++) {
    		tmp = ch[i];
    		ch[i] = ch[ch.length - i - 1];
    		ch[ch.length - i - 1] = tmp;
    	}
    	
    	return Long.parseLong(new String(ch));
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programers14 obj = new Programers14();
		
		System.out.println(obj.solution(4343843));
	}

}
//문제 설명
//함수 solution은 정수 n을 매개변수로 입력받습니다. 
//n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
//예를들어 n이 118372면 873211을 리턴하면 됩니다.

//제한 조건
//n은 1이상 8000000000 이하인 자연수입니다.

//long => String[] => sort => n-i-1 => long