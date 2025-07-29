//program to find the day using switch cases to find the given number is of which day
package skill;
import java.util.Scanner;
public class Days {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 0 to 8 to find the day");
		int a = sc.nextInt();
		switch(a) {
			case 1:
				System.out.println("Monday");break;
			case 2:
				System.out.println("Tuesday");break;
			case 3:
				System.out.println("Wednesday");break;
			case 4:
				System.out.println("Thursday");break;
			case 5:
				System.out.println("Friday");break;
			case 6:
				System.out.println("Saturday");break;
			case 7:
				System.out.println("Sunday");break;
			default:
				System.out.println("Wrong input");
		}
	}
}
