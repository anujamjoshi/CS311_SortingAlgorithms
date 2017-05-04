import java.util.Random;


public class QuickSort {
	int[]array; 
	QuickSort(int [] a){
		super(); 
		this.array=a; 
	}
	public int[] quickSort1(int p, int q){
		if (p<q){
			int pivotPosition = partition(p,q);
			quickSort1(p, pivotPosition-1);
			quickSort1(pivotPosition+1, q);
		}
		return array;
	}
	public int[]quickSort2(int p, int q){
		/*
		 * note I had to add one because the size of the array is q + 1 because 
		 */
		if (q - p+1 <=16){
		//	System.out.println("IS");
			InsertionSort is = new InsertionSort(array);
			array = is.insertionSort();
		}
		else{
			array = quickSort1(p,q);
		}
		return array;
	}
	public int[]quickSort3(int p, int q){
		if (p<q){
			int pivotPosition = partitionRandom(p,q);
			quickSort1(p, pivotPosition-1);
			quickSort1(pivotPosition+1, q);
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
			//System.out.println("TB" + tb  + "TS" + ts) ;
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
		/*
		 * if ((q-p+1) >=16) then
		 * swap a[p] and a[p + Random() mod (q-p+1)];
		 */
		if ((last -first +1) >= 16){
			Random r = new Random(); 
			int temp = array[first];
			int rand = Math.abs(r.nextInt());
			int val = (last -first +1);  
			array[first] = array[first + (Math.abs(r.nextInt())%(last -first +1))];
			array[first + (Math.abs(r.nextInt())%(last -first +1))] = temp; 
		}
		return partition(first, last);
		
	}
}
