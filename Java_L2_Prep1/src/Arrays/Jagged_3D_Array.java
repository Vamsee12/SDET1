package Arrays;

public class Jagged_3D_Array {

	public static void main(String[] args) {

		int[][][] a= {{{10,20},{30,40,50,60}}};
		
		System.out.println(a.length); //outer array
		System.out.println(a[0].length); //inner array which has two sets of data
		System.out.println(a[0][0].length); //complete inner array with first set of data
		System.out.println(a[0][1].length); //complete inner array with second set of data
		System.out.println();
		
		for(int i=0;i<a.length;i++)                                        //outer array
		{
			for(int j=0;j<a[i].length;j++)                                  //inner array
			{
				for(int k=0;k<a[i][j].length;k++)                           //complete inner array
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
		}
	}

}
