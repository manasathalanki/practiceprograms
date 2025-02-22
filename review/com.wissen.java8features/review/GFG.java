package review;
// Java implementation of the approach
import java.util.*;

class GFG {

	// Function to return the maximum
	// possible pairs of gloves
	static int cntgloves(int arr[], int n)
	{
		
		// Sort the original array
		Arrays.sort(arr);
		int res = 0;
		int i = 0;

		while (i < n) {
			
			// take first number
			int number = arr[i];
			int count = 1;
			i++;

			// Count all duplicates
			while (i < n && arr[i] == number) {
				count++;
				i++;
			}
			
			// If we spotted number just 2 
			// times, increment
			// result
			if (count >= 2) {
				res = res + count / 2; 
			}
		}
		return res; 
	}

	// Driver code
	public static void main(String[] args)
	{

		int arr[] = {10,20,15,20,20};
		int n = arr.length;

		// Function call
		System.out.println(cntgloves(arr, n));
	}
}

// This code is contributed by Lakhan murmu
