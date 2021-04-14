package Programers;

public class Programers20 {
	
    public long[] solution(long x, int n) {
        long[] result = new long[n];
        
        for(int i=0; i<n; i++){
        	result[i] = x * (i+1);
        }
        
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programers20 obj = new Programers20();
		for(long i : obj.solution(3, 6)) {
			System.out.println(i);
		}
	}

}
//문제 설명
//함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
//다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
//
//제한 조건
//x는 -10000000 이상, 10000000 이하인 정수입니다.
//n은 1000 이하인 자연수입니다.
