//program to find the sum of the squares of the number
package skill;
import java.util.*;
public class Sum_of_squares {
	public static void main(String args[]) {
		int n,sum=0;
		int x;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i=1;i<n+1;i++) {
			x=i*i;
			sum=sum+x;
		}
		System.out.println("The sum of the squares of the number is: " +sum);
	}
}
