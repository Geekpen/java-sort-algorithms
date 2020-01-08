package bubbleSort;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		int[] data = {8,7,6,4,2};
		new BubbleSort().bsort(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void bsort(int[] data) {
		/* In the pseudo code we have 'for i = 0 to A.length-2'
		 * Both values 0 and A.length-2 are inclusive, so in the java code below
		 * we are having the condition i < data.length - 1 
		 * if you want you can change it to i <= data.length - 2 */
 
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				// do the swap if required
				if (data[j] > data[j+1]) {
					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;
				} 
			}
		}
	}

}