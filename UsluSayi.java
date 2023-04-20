import java.util.Scanner;
public class UsluSayi {

	public static void main(String[] args) {
		int a, b;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Üssü alınacak sayıyı giriniz: ");
		a = scan.nextInt();
		
		System.out.print("Üs olacak sayıyı giriniz: ");
		b = scan.nextInt();
		
		int total = 1;
		
		for(int i = 1; i <=b;i++) {
			total *= a;
		}
		
		System.out.println(total);
	}

}
