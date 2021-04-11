package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class mma {
	
	public static int[] mma (int [] arr) {
		
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length-1];
		int avg = sum / arr.length;
		
		int[] result = {min,max,avg};
		
		return result;
	}

	public static List<Integer> mma (List<Integer> li){
		
		int sum=0;
		
		for(int i=0; i<li.size(); i++) {
			sum += li.get(i);
		}
		
		int min = Collections.min(li);
		int max = Collections.max(li);
		int avg = sum / li.size();
		
		List<Integer> result = Arrays.asList(min,max,avg);
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int[] result = mma.mma(arr);
		
		for(int i : result) {
			System.out.print(i);
		}
		
		System.out.println();
		
		List<Integer> li = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> result2 = mma.mma(li);
		
		for(int i : result2) {
			System.out.print(i);
		}
		
	}

}
