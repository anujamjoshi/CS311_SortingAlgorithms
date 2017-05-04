
public class InsertionSort {
	int[]array ; 
	
	public InsertionSort(int[] array) {
		super();
		this.array = array;
	}
	public int[] insertionSort(){
		for (int i =0; i < array.length;i++){
			int insertVal = array[i];
			int j = i-1; 
			while (j>=0 && array[j] > insertVal)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1]=insertVal; 
		}
		return array; 
		
	}
	

}
