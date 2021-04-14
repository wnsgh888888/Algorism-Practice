package Practice;

import java.util.ArrayList;
import java.util.List;

public class DivMul {
	public static List<Integer> divNum (int num) {
		
		List<Integer> result = new ArrayList<>();
		
		for(int i=1; i<=num; i++)   //1부터 n까지
			if(num % i == 0)
				result.add(i);
				
		return result;
	}
	
	public static List<Integer> mulNum (int num) {
		
		List<Integer> result = new ArrayList<>();	
		
		for(int i=1; i<100; i++) {   //1부터 시작
			if(i % num == 0)
				result.add(i);
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i : DivMul.mulNum(3)) {
			System.out.println(i);
		}
	}

}
