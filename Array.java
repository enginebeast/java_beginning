package hello;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		int[] score = new int[10];
		int sum = 0;
		int average = 0;
		
		//Input major number
		while(true) {
			System.out.print("Please input major number: ");
			num = scanner.nextInt();
			if(num>100)
				System.out.println("You cannot input number bigger than 10.");
			else
				break;
		}
		
		//Input scores
		for(int i = 0; i<num; ) {
			int temp = 0;
			System.out.print(i + ": ");
			temp = scanner.nextInt();
			if(temp>100) 
				System.out.println("You cannot input score bigger than 100.");
			else {
				score[i] = temp;
				i++;
			}
		}
		
		//Calculate and print average score.
		for(int i = 0; i<num; i++) {
			sum += score[i];
		}
		average = sum/num;
		System.out.println("Average score: " + average);

		scanner.close();
	}
}
