package Programers;

public class Programers16 {
	
	public boolean isPrime(int p) {
		
		for(int i=2; i<=Math.sqrt(p); i++) {
			if(p % i == 0)
				return false;
		}
		
		return true;
	}
	
	public int solution(int[] arr) {
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					if(isPrime(arr[i] + arr[j] + arr[k]))
						count++;
				}
			}
		}
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programers16 obj = new Programers16();
		int[] arr= {2,3,7,8,4,7};
		
		
		System.out.println(obj.solution(arr));
	}

}
//문제 설명
//주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 
//숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
//nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
//
//제한사항
//nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
//nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

//