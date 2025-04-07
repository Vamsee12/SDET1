package generalInterviewCodes;

import java.util.Arrays;

public class MoveZerosToStart {

	public static void main(String[] args) 
	{
		int[] arr = {1,0,2,0,4,3,0,5};
		moveZerosToStart(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void moveZerosToStart(int[] arr)
	{
		int n = arr.length;
		int j = n-1;
		
		for(int i = n-1; i>=0; i--)
		{
			if(arr[i]!=0)
			{
				arr[j--] = arr[i];
			}
		}
		
		while(j >=0)
		{
			arr[j--] = 0;
		}
	}

}
