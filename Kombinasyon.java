import java.util.Scanner;
public class Kombinasyon {

	public static void main(String[] args) {
		int inputN;
		int inputr;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kombinasyon için N ve r değerlerini giriniz: ");
		inputN = scan.nextInt();
		inputr = scan.nextInt();
		
		int total1 = 1;
		int total2 = 1;
		
		for(int i = inputN; i > inputN-inputr; i--) {
			total1 *= i;
		}
		
		for(int i = inputr; i>=1; i--) {
			total2 *= i;
		}
		
		int combination = total1/total2;
		System.out.println(inputN + " sayısının " + inputr + " kombinasyonu: " + combination);
	} 

}
