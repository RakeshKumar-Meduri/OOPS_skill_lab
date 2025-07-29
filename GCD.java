package skill;
import java.util.Scanner;
public class GCD {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = 0;
		int min_num = (a>b)?a:b;
		for(int i = 1; i <= min_num;i++) {
			if(a%i == 0 && b%i == 0 && i>max) {
				max = i;
			}
		}
		System.out.println(+max);
	}
}
