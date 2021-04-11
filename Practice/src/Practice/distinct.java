package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class distinct {
	
	public static List<Integer> distinct (List<Integer> li){
		
		List<Integer> result = new ArrayList<>();
		
		for(int i : li) {
			if(!result.contains(i)) {
				result.add(i);
			}
		}
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = Arrays.asList(1,1,1,1,1,2,3,4);
		
		List<Integer> result = distinct.distinct(li);
		
		for(int i : result) {
			System.out.print(i);
		}
		
		
	}
}

