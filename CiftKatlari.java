import java.util.Scanner;
public class CiftKatlari {

	public static void main(String[] args) {
		int input;
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		
		do {
			System.out.print("Sayı giriniz: ");
			input = scan.nextInt();
			
			if(input%4==0) {
				total +=input;
			}
			
		}while(input%2==0);
		
		System.out.println("Toplam: " + total);

	}
}