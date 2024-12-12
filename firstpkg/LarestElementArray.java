package firstpkg;

public class LarestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{ 23,12,56,34,60,23 }; 
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Largest element present in given array: " + max);  
	}

}
