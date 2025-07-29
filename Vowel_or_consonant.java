//Program to check whether a given character is a vowel or a consonant
package skill;
import java.util.Scanner;
public class Vowel_or_consonant {
	public static void main(String args[]) {
		char n;
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		n = sc.next().charAt(0);
		if(n=='a' || n == 'e' || n=='i'|| n=='o'||n=='u') {
			System.out.println(n+ " is a vowel");
		}
		else if(n=='A' || n == 'E' || n=='I'|| n=='O'||n=='U') {
			System.out.println(n+ " is a vowel");
		}
		else
			System.out.println(n+ " is a consonant");
	}
}

