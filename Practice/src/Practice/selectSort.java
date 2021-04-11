package Practice;

public class selectSort {
	
	public static int[] selectSort (int[] arr) {
		
		int min = 0;
		int temp = 0;
		
		for(int i=0; i<arr.length-1; i++) {
		 	min = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min])
					min = j;
			}
			
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,7,2,8,10};
		for (int i=0; i<arr.length; i++) {
			System.out.println(selectSort.selectSort(arr)[i]);
		}
	}

}
