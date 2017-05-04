import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]temp = createRandom(16*2);
		printArray(temp);
		System.out.println();
		QuickSort qs = new QuickSort(temp);
		int [] temp1 = qs.quickSort1(0, temp.length-1); 
		printArray(temp1);
		qs = new QuickSort(temp);
		temp1 = qs.quickSort2(0,temp.length-1); 
		printArray(temp1);
		temp1 = qs.quickSort3(0, temp.length-1); 
		printArray(temp1); 
	}
	public static void printArray(int[]t){
		for (int i : t){
			System.out.print(i + " ");
		}
		System.out.println(); 
	}
	public static int[] createRandom(int size){
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		Random r = new Random();
		for (int j = 1; j <= (size); j++) {
			tempArray.add(j);
			//tempArray.add(Math.abs(r.nextInt()));
		}
		//Collections.shuffle(tempArray);
		
		int [] temp = new int[tempArray.size()];
		for (int j = 0; j < (temp.length); j++) {
			temp[j]=tempArray.get(j);
		}
		return temp;
	}

}
