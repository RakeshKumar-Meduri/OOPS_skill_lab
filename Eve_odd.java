//program to find a given number is even or odd using if else
package skill;
import java.util.*;
public class Eve_odd {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0)
			System.out.println(a+ " is even number");
		else
			System.out.println(a+ " is odd number");
	}
}
