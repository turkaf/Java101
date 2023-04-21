import java.util.Scanner;
public class TersUcgen {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Basamak sayısı giriniz: ");
		input = scan.nextInt();
		
		for(int i = input; i>=1; i--) {
			for(int j = 1; j <= input-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<=2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}