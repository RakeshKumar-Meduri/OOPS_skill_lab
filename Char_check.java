//Program to check whether a given character is an alphabet or not
package skill;
import java.util.Scanner;
public class Char_check {
	public static void main(String args[]) {
		char n;
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		n = sc.next().charAt(0);
		if((n>='a' && n<='z') || (n>='A' && n<='Z')) {
			System.out.println(n+ " is a character");
		}
		else
			System.out.println(n+ " is not a character");
	}
}
