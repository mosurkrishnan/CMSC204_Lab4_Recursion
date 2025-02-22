
public class ArraySum {
	
	/**
	 * @author Chandra S. Krishnan
	 * Recursive method to sum the values in an array of integers
	 * @param a - ‘a’ is an array of type Integer that is specified in the driver file
	 * @param index - ‘index’ is an integer that shows which number in the array to sum next. 
	 * @return sum of array
	 */
	public int sumOfArray(Integer[] a, int index) {
		// hold elements of type Integer
		// start at element a (on extreme right of array and sum sequentially moving left 
		// keep changing index --> index-1
	    // Base Case: If index reaches the end of the array, return 0
		int sum;
		if(index == 0) 
			{
				sum = a[index];
			}
		else {
			sum = a[index] + sumOfArray(a,index-1);
		}
		return sum;
	}
}
