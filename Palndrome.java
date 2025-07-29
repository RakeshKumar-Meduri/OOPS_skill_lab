//program to find the number is a palindrome or not 
package skill;
import java.util.Scanner;
public class Palndrome {
	public static void main(String args[]) {
		int n,r,x=0;
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int o = n;
		while(n!=0) {
			r = n%10;
			x=x*10+r;
			n /= 10;
		}
		if(o == x) {
			System.out.println(o + " is a palindrome number.");
        } else {
            System.out.println(o + " is not a palindrome number.");
		}
	}
}
