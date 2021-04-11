package Practice;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {
	
	public static int fibonacci (int k) {
		
		if(k<=1)
			return k;
		else
			return fibonacci(k-1) + fibonacci(k-2);
	}
	
	public static int fibonacci2 (int k) {
		
		int[] arr = new int[k+1];   //n번째 수를 구하려면 n번째 배열을 구해야 하기에
		
		for(int i=0; i<=k; i++) {
			
			if(i<=1) 
				arr[i] = i;
			else 
				arr[i] = arr[i - 1] + arr[i - 2];			
		}
		
		return arr[k];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci.fibonacci2(3));
		//
	}

}
