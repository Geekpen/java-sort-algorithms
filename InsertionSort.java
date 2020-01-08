package insertionSort;

import java.util.Arrays;
public class sort {


	public static void main(String[] args) {
		int[] data = {7,3,6,8,2};
		new sort().sortD(data);
		System.out.println(Arrays.toString(data));
	}
	
	public void sortD(int[] data) {
		for (int i =0; i < data.length; i++) {
			int current = data[i];
			int j = i-1;
			while (j >=0 && data[j] >= current) {
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = current;
		}
	}

}
