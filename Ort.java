import java.util.Scanner;
public class Ort {

	public static void main(String[] args) {
		int input;
		
		Scanner scan = new Scanner(System.in);
		
		input = scan.nextInt();
		int total = 0;
		int count = 0;
		
		for(int i=1; i<=input; i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i);
				total += i;
				count++;
			}
		}
	
		double average = total / count;
		System.out.println("Average is " + average);
	}
}