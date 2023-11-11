/**
 * How do you sum all the elements in an array?
 **/
import java.util.Scanner;
class Q1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length Of Array: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i = 0; i<n; i++){
			System.out.print("Enter Array["+i+"]: ");
			array[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i : array)
		    sum += i;

		System.out.println("Sum of all elements of array: "+sum);
	}
}