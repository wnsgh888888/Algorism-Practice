package Practice;

public class bubbleSort {
	
	public static int[] bubbleSort (int[] arr) {
		
		int temp = 0;
		
		for(int i=0; i<arr.length-1;i++) {	
			for(int j=0; j<arr.length-i-1; j++) {   
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,7,8,2,1};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(bubbleSort.bubbleSort(arr)[i]);
		}
	}
}
