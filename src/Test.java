import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> tempArray = new ArrayList<Integer>();;
		for (int j = 1; j <= (16); j++) {
			tempArray.add(j);
		}
		Collections.shuffle(tempArray);
		
		int [] temp = new int[tempArray.size()];
		for (int j = 0; j < (temp.length); j++) {
			temp[j]=tempArray.get(j);
		}
		printArray(temp);
		System.out.println();
		QuickSort qs = new QuickSort(temp);
		temp = qs.quicksort3(0, temp.length-1);
		printArray(temp);
	}
	public static void printArray(int[]t){
		for (int i : t){
			System.out.print(i + " ");
		}
	}

}
