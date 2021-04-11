package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverse {
	
	public static int[] reverse (int[] arr) {
		
		int temp = 0;
		int length = arr.length;
		
		for(int i=0; i<length/2; i++ ) {
			temp = arr[i];
			arr[i] = arr[length-i-1];
			arr[length-i-1] = temp;
		}
		
		return arr;
	}
	
	public static List<Integer> reverse (List<Integer> li){
		
		Collections.reverse(li);
		
		return li;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		reverse.reverse(arr);
		
		for(int i : arr) {
			System.out.print(i);
		}
		
		System.out.println();
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		reverse.reverse(li);
		
		for(int i : li) {
			System.out.print(i);
		}
	}

}
