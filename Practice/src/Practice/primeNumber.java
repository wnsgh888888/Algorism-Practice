package Practice;

public class primeNumber {
	
	public static boolean solution(int n) {
		
		int chk = 0;
		
		for(int i=1; i<n; i++) {
			if (n % i == 0) 
				chk++;
		}
		
		return chk == 1 ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(primeNumber.solution(10));
		
		
	}
}
