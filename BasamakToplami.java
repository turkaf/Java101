import java.util.Scanner;

public class BasamakToplami {

	public static void main(String[] args) {
		int input, tempNum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		input = scan.nextInt();
		
		int total = 0;
		tempNum = input;
		
		while(tempNum != 0) {
			total += tempNum%10;
			tempNum /= 10;
		}
		
		System.out.println(input + " sayısının basamakları toplamı: " + total);
	}
}