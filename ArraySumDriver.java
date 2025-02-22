public class ArraySumDriver {
	private final static int ARRAY_SIZE = 6;

	/**
	 * @author Chandra S. Krishnan 
	 * Main method drives a recursive method to sum the values in an array of integers
	 */
	public static void main(String[] args) {
		int index = 0;
							// declares and initializes an array named Array that can 
							// hold elements of type Integer
		Integer[] myArray = new Integer[ARRAY_SIZE];
							// myArray = {null, null, null, null, null, null}
		ArraySum arraySum = new ArraySum();
							// myArray = {3, null, null, null, null, null}
		myArray[index++] = 3;
							// myArray = {3, 5, null, null, null, null}
		myArray[index++] = 5;
							// myArray = {3, 5, 2, null, null, null}
		myArray[index++] = 2;
							// myArray = {3, 5, 2, 6, null, null}
		myArray[index++] = 6;
							// public int sumOfArray (Integer[] a,int index).
							// Note that ‘a’ is an array of type Integer that is specified in the driver file, 
							// and ‘index’ is an integer that shows which number in the array to sum next.  
							// sum array from element 3 (which is 6) and to its right - 6, null, null = 6
		int sum = arraySum.sumOfArray(myArray, 3);
							// sum =  6 + sumOfArray({3, 5, 2, 6, null, null}, 4)
							// next recursion: sum=a[index]+sumOfArray(a,index-1);
							// = 6 + 2 (index-1 = 2)
							// = 6 + 2 + 5 (index-1 = 1)
							// = 6 + 2 + 5 + 3 (index-1 = 3)
		System.out.println(sum); // answer is 16
		
							// myArray = {3, 5, 2, 6, 7, null}
		myArray[index++] = 7;
							// myArray = {3, 5, 2, 6, 7, 1}
		myArray[index++] = 1;	
		sum = arraySum.sumOfArray(myArray, 5);
							// = 1
							// = 1 + 7 (index-1 = 4)
							// = 1 + 7 + 6 (index-1 = 3)
							// = 1 + 7 + 6 + 2 (index-1 = 2)
							// = 1 + 7 + 6 + 2 + 5 (index-1 = 1)
							// = 1 + 7 + 6 + 2 + 5 + 3 (index-1 = 0)
		System.out.println(sum); // answer should be 24
	}
}