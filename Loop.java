package hello;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for(int i = 0; i < num ; i++) {
			for(int j = 4-i; j > 0; j-- )
				System.out.print(" ");
			for(int j = 0; j <= i*2; j++ )
				System.out.print("*");
			System.out.print("\n");
		}
		
		scanner.close();
	}
}
