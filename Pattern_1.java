package skill;

public class Pattern_1 {
	public static void main(String args[]) {
		int k = 5;
		for(int i = 5 ;i> 0;i--) {
			for(int j = 1 ;j<=i;j++) {
				System.out.print(+ (k--));
			}
			k = 5;
			System.out.println();
		}
	
	}
}
