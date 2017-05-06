import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		System.out.println("Testing Random ordered data");
			testRandom(); 
			System.out.println("\n\n\n");
			System.out.println("Testing Sorted data");
			testSorted(); 
	}

	private static void testSorted() {
		for (int i = 1; i <= 5; i++){
			int[]temp = createSorted((int)Math.pow(2, i));
			System.out.println();
			System.out.println("Testing n = " + temp.length + " or 2 ^" + i);
			System.out.println("Array to Sort:  ") ;
			printArray(temp);
			System.out.println();
			long time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				InsertionSort is = new InsertionSort(temp);
				time+= getTimeInsertion(is);
				printArray(is.array);

			}
			System.out.println("Average insertion time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				MergeSort ms = new MergeSort(temp);
				time+= getTimeMerge(ms);
				printArray(ms.array);

			}
			System.out.println("Average merge time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick1(qs);
				printArray(qs.array);

			}
			System.out.println("Average quicksort1 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick2(qs);
				printArray(qs.array);

			}
			System.out.println("Average quicksort2 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick3(qs);
				printArray(qs.array);

			}
			System.out.println("Average quicksort3 time is : " + time/5);
		}

		for (int i = 6; i <= 14; i++){
			int[]temp = createSorted((int) Math.pow(2, i));
			System.out.println();
			System.out.println("Testing n = " + temp.length + " or 2 ^" + i);
			long time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				InsertionSort is = new InsertionSort(temp);
				time+= getTimeInsertion(is);
			}
			System.out.println("Average insertion time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				MergeSort ms = new MergeSort(temp);
				time+= getTimeMerge(ms);
			}
			System.out.println("Average merge time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick1(qs);
			}
			System.out.println("Average quicksort1 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick2(qs);
			}
			System.out.println("Average quicksort2 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick3(qs);
			}
			System.out.println("Average quicksort3 time is : " + time/5);
		}
//		for (int i = 15; i <= 16; i++){
//			int[]temp = createSorted((int) Math.pow(2, i));
//			System.out.println();
//			System.out.println("Testing n = " + temp.length + " or 2 ^" + i);
//			System.out.println("Array to Sort:  ") ;
//			long time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				InsertionSort is = new InsertionSort(temp);
//				time+= getTimeInsertion(is);
//			}
//			System.out.println("Average insertion time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				MergeSort ms = new MergeSort(temp);
//				time+= getTimeMerge(ms);
//			}
//			System.out.println("Average merge time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				QuickSort qs = new QuickSort(temp);
//				time+= getTimeQuick1(qs);
//			}
//			System.out.println("Average quicksort1 time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				QuickSort qs = new QuickSort(temp);
//				time+= getTimeQuick2(qs);
//			}
//			System.out.println("Average quicksort2 time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				QuickSort qs = new QuickSort(temp);
//				time+= getTimeQuick3(qs);
//			}
//			System.out.println("Average quicksort3 time is : " + time/5);
//		}
	
		
	}

	private static void testRandom(){


		for (int i = 1; i <= 5; i++){
			int[]temp = createRandom((int)Math.pow(2, i));
			System.out.println();
			System.out.println("Testing n = " + temp.length + " or 2 ^" + i);
			System.out.println("Array to Sort:  ") ;
			printArray(temp);
			System.out.println();
			long time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				InsertionSort is = new InsertionSort(temp);
				time+= getTimeInsertion(is);
				printArray(is.array);

			}
			System.out.println("Average insertion time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				MergeSort ms = new MergeSort(temp);
				time+= getTimeMerge(ms);
				printArray(ms.array);

			}
			System.out.println("Average merge time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick1(qs);
				printArray(qs.array);

			}
			System.out.println("Average quicksort1 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick2(qs);
				printArray(qs.array);

			}
			System.out.println("Average quicksort2 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick3(qs);
				printArray(qs.array);

			}
			System.out.println("Average quicksort3 time is : " + time/5);
		}

		for (int i = 6; i <= 14; i++){
			int[]temp = createRandom((int) Math.pow(2, i));
			System.out.println();
			System.out.println("Testing n = " + temp.length + " or 2 ^" + i);
			long time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				InsertionSort is = new InsertionSort(temp);
				time+= getTimeInsertion(is);
			}
			System.out.println("Average insertion time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				MergeSort ms = new MergeSort(temp);
				time+= getTimeMerge(ms);
			}
			System.out.println("Average merge time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick1(qs);
			}
			System.out.println("Average quicksort1 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick2(qs);
			}
			System.out.println("Average quicksort2 time is : " + time/5);
			time = 0; 
			for (int calcVal =0; calcVal < 5; calcVal++) {
				QuickSort qs = new QuickSort(temp);
				time+= getTimeQuick3(qs);
			}
			System.out.println("Average quicksort3 time is : " + time/5);
		}
//		for (int i = 15; i <= 16; i++){
//			int[]temp = createRandom((int) Math.pow(2, i));
//			System.out.println();
//			System.out.println("Testing n = " + temp.length + " or 2 ^" + i);
//			System.out.println("Array to Sort:  ") ;
//			long time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				InsertionSort is = new InsertionSort(temp);
//				time+= getTimeInsertion(is);
//			}
//			System.out.println("Average insertion time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				MergeSort ms = new MergeSort(temp);
//				time+= getTimeMerge(ms);
//			}
//			System.out.println("Average merge time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				QuickSort qs = new QuickSort(temp);
//				time+= getTimeQuick1(qs);
//			}
//			System.out.println("Average quicksort1 time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				QuickSort qs = new QuickSort(temp);
//				time+= getTimeQuick2(qs);
//			}
//			System.out.println("Average quicksort2 time is : " + time/5);
//			time = 0; 
//			for (int calcVal =0; calcVal < 5; calcVal++) {
//				QuickSort qs = new QuickSort(temp);
//				time+= getTimeQuick3(qs);
//			}
//			System.out.println("Average quicksort3 time is : " + time/5);
//		}
	}
	public static long getTimeInsertion(InsertionSort i){
		long start = System.nanoTime(); 
		i.insertionSort();
		return System.nanoTime()-start;
	}
	public static long getTimeMerge(MergeSort m){
		long start = System.nanoTime(); 
		m.mergeSort();
		return System.nanoTime()-start;
	}
	public static long getTimeQuick1(QuickSort q){
		long start = System.nanoTime(); 
		q.qs1();
		return System.nanoTime()-start;
	}
	public static long getTimeQuick2(QuickSort q){
		long start = System.nanoTime(); 
		q.qs2();
		return System.nanoTime()-start;
	}
	public static  long getTimeQuick3(QuickSort q){
		long start = System.nanoTime(); 
		q.qs3();
		return System.nanoTime()-start;
	}
	public static void printArray(int[]t){
		System.out.print( "[ ");
		for (int i : t){
			System.out.print(i + " ");
		}
		System.out.print( " ]");
		System.out.println(); 
	}
	public static int[] createRandom(int size){
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		Random r = new Random();
		for (int j = 1; j <= (size); j++) {
			tempArray.add(Math.abs(r.nextInt()));
		}
		Collections.shuffle(tempArray);

		int [] temp = new int[tempArray.size()];
		for (int j = 0; j < (temp.length); j++) {
			temp[j]=tempArray.get(j);
		}
		return temp;
	}
	private static int[] createSorted(int size) {
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		Random r = new Random();
		for (int j = 1; j <= (size); j++) {
			tempArray.add(Math.abs(r.nextInt()));
		}
		Collections.sort(tempArray);

		int [] temp = new int[tempArray.size()];
		for (int j = 0; j < (temp.length); j++) {
			temp[j]=tempArray.get(j);
		}
		return temp;
	}

}