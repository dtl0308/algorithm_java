package sort;

public class Insert_Sort {

	public static void main(String[] args) {
		int[] arr = {5,8,9,6,4,11,15,1,3,2,10};
		insert_sort(arr, 0, arr.length-1);
		
		for(int p : arr) {
			System.out.print(p + ",");
		}
		
	}	
	public static void insert_sort(int[] arr, int left, int right) {
		
		if(arr == null || arr.length <= 1) {
			return;
		}
		if(left >= right) {
			return;
		}
		
		for(int i=left+1; i<=right; i++) {
			int base = arr[i];
			if(arr[i-1] > base) {
				arr[i] = arr[i-1];
				int j=i-1;
				while(j>0 && arr[j-1] > base) {
					arr[j] = arr[j-1];
					j--;
				}
				arr[j] = base;
				
			}
		}
		
	}
}
