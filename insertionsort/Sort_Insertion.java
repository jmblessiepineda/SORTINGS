
package insertionsort;
import java.util.Scanner;
 
public class Sort_Insertion 
{
	int numbers[] = null;
	int n = 0;
	
	Scanner scan = new Scanner(System.in);
	
	void getNumbers() {
		
		System.out.println("Insertion Sort");
		System.out.println("\nEnter n value :");
		n = Integer.parseInt(scan.nextLine());
		
		numbers = new int[n];
		
		System.out.println("Enter the Numbers :");
		
		for(int i=0; i<n; i++) {
			
			numbers[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
	void InsertionSort() {
		
		System.out.println("\nBefore Sorting :");
		
		for(int i=0; i<n; i++) {
			
			System.out.print(numbers[i] + " ");
		}
		
		/* Insertion Sort Code Start */
 
		for (int i = 1; i < n; i++) {
			
			int j = i;
			int B = numbers[i];
			
			while ((j > 0) && (numbers[j-1] > B)) {
				
				numbers[j] = numbers[j-1];
				j--;
			}
			
			numbers[j] = B;
		}
		
		/* Insertion Sort Code End */
 
		System.out.println("\n \nAfter Sorting");
		System.out.println("\nAscending Order :");
 
		for(int i=0; i<n; i++) {
			
			System.out.print(" " + numbers[i]);
		}
		
		System.out.println("\nDescending Order :");
 
		for(int i=n-1; i>=0; i--) {
			
			System.out.print(" " + numbers[i]);
		}
	}
}

 
class MainClass {
	
	public static void main(String args[]) {
		
		Sort_Insertion obj = new Sort_Insertion();
		
		obj.getNumbers();
		obj.InsertionSort();
	}
}