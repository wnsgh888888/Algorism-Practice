package Programers;

public class Programers6 {

	public int solution(int n) {
		
		int chk = 0;
		int count = 0;
		
		for(int i=2; i<=n; i++) {
			chk = 0;
			for(int j=1; j<i; j++) {
				if(i % j == 0)
				chk++;
			}
			if(chk == 1)
				count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programers6 obj = new Programers6();
		System.out.println(obj.solution(5));
		
	}

}
//문제 설명
//1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
//
//소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
//(1은 소수가 아닙니다.)
//
//제한 조건
//n은 2이상 1000000이하의 자연수입니다.
//10 => 2,3,5,7
//5 => 2,3,5
