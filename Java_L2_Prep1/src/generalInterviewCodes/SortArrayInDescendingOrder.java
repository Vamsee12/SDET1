package generalInterviewCodes;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayInDescendingOrder {

	public static void main(String[] args) {
		
		Integer[] arr = {2,6,9,1,8,7};   //Integer supports Collections so we use Integer instead of int
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(Arrays.toString(arr));

	}

}
