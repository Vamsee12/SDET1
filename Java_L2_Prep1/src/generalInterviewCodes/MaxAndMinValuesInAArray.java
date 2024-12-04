package generalInterviewCodes;

public class MaxAndMinValuesInAArray {

	public static void main(String[] args) {
		
		int[] a = {50,80,75,37,91,67};
		
		int max = a[0];  //here we are assigning first element as max
		
		for(int i=1;i<a.length;i++)       // in this for loop a[0] will be compared with all the elements in the array and if any bigger value is present it will update the max value
		{
			if(a[i]>max)                  //to find min value just need to change if(a[i]<min), need to change variable name for our understanding.
			{
				max = a[i];
			}
		}
		
		System.out.println(max);

	}

}
