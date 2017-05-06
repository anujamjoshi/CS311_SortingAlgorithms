
public class MergeSort {
	int[]array ; 

	public MergeSort(int[] array) {
		super();
		this.array = array;
	}

	public int[] mergeSort(){
		sortArray(0, array.length-1);
		return array;
	}
	private void sortArray(int low, int high){
		if (low<high){
			int mid = (high+low)/2;
			sortArray(low, mid);
			sortArray( mid+1, high);
			sort(low, mid, high);

		}
	}
	private void sort(int low, int mid, int high) {
		int [] U = new int [array.length];
		int i = low, j = mid+1 , k = low; 
		while (i <= mid && j <= high){
			if (array[i]<= array[j]){
				U[k] = array[i];
				i++;
			}
			else{
				U[k] = array[j];
				j++; 
			}
			k++; 
		}
		if (i > mid){
			while (j <= high){
				U[k]=array[j];
				j++;
				k++;
			}
		}
		else{
			while( i <= mid){
				U[k] = array[i];
				i++; 
				k++;
			}
		}
		for (int index = low; index <=high; index++) {
			array[index] = U[index];
		}

	}
}
