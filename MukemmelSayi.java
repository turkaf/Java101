import java.util.Scanner;
public class MukemmelSayi {

	public static void main(String[] args) {
		int input, total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		input = scan.nextInt();
		
		for(int i = 1; i < input; i++) {
			if(input%i == 0) {
				total += i;
			}
		}
		
		if(total == input) {
			System.out.println(input + " sayısı mükemmel bir sayıdır.");
		}else {
			System.out.println(input + " sayısı mükemmel bir sayı DEĞİLDİR!");
		}

	}

}
