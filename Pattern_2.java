package skill;

public class Pattern_2 {
	public static void main(String args[]) {
		int k =1;
		for(int i = 5 ;i> 0;i--) {
			for(int j = 1 ;j<=i;j++) {
				System.out.print(+ (k++));
			}
			k = 1;
			System.out.println();
		}
	}
}
