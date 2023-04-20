import java.util.Scanner;
public class Harmonik {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		input = scan.nextInt();
		
		double total = 0;
		
		for(double i = 1; i<=input; i++) {
			total += (1/i);
		}
		System.out.println(total);	
	}
}