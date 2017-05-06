import java.util.Random;


public class QuickSort {
	int[]array; 
	QuickSort(int [] a){
		super(); 
		this.array=a; 
	}
	public int [] qs1(){
		return quickSort1(0, array.length-1);
	}
	private int[] quickSort1(int p, int q){
		if (p<q){
			int pivotPosition = partition(p,q);
			quickSort1(p, pivotPosition-1);
			quickSort1(pivotPosition+1, q);
		}
		return array;
	}
	public int [] qs2(){
		return quickSort2(0, array.length-1);
	}
	private int[]quickSort2(int p, int q){

		if (array.length<=16){

			InsertionSort is = new InsertionSort(array);
			array = is.insertionSort();
		}
		else{
			array = quickSort1(p,q);
		}
		return array;
	}
	public int [] qs3(){
		return quickSort3(0, array.length-1);
	}
	private int[]quickSort3(int p, int q){
		if (array.length <= 16) {
			InsertionSort is = new InsertionSort(array);
			array = is.insertionSort();

		} else {

			if (p < q) {
				int pivot = partitionRandom( p, q);

				if (pivot > 1)
					quickSort3(p, pivot - 1);

				if (pivot + 1 < q)
					quickSort3( pivot + 1, q);
			}
		}
		return array;
	}
	private int partition(int first, int last) {
		int pivot = array[first];
		int tb = first+1;
		int ts = last; 
		while(true){
			while(tb<=last && array[tb]<pivot){
				tb++; 
			}
			while(ts > first && array[ts] >pivot){
				ts--;
			}

			if (tb<ts){
				int temp = array[tb];
				array[tb]=array[ts];
				array[ts]=temp; 
			}
			else{
				break;
			}
		}
		array[first] = array[ts];
		array[ts] = pivot;
		return ts;
	}
	private int partitionRandom(int first, int last){
		Random rand = new Random();
		int pivot = array[first + rand.nextInt(last - first)];
		while (true) {
			while (array[first] < pivot)
				first++;

			while (array[last] > pivot)
				last--;

			if (first < last) {
				int temp = array[last];
				array[last] = array[first];
				array[first] = temp;
			} else {
				return last;
			}
		}

	}
}
