package Practice;

public class primeNumber {
	
	public static boolean solution(int n) {
		
		int count = 0;
		
		for(int i=2; i<n; i++) {
			if (n % i == 0) 
				count++;
		}
		
		return count == 0 ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeNumber.solution(3));
	}
}