//program to print the sum of the given number
package skill;
import java.util.Scanner;
public class Sum_of_digits {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();

	        while (num >= 10) {
	            int sum = 0;
	            while (num > 0) {
	                sum += num % 10;  
	                num = num / 10;   
	            }
	            num = sum;  
	        }

	        System.out.println("Single digit sum is: " + num);
	        sc.close();
	    }
	}
