//program to print the numbers from 1 to n using the for loop
package skill;
import java.util.Scanner;
public class For {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<n+1;i++) {
			System.out.println(" " + i);
		}
	}
}
