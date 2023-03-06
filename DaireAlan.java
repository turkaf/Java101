import java.util.Scanner;

public class DaireAlan {

	public static void main(String[] args) {
		int r, alf;
		double pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yarıçapı giriniz: ");
		r = scan.nextInt();
		
		double alan = pi*r*r;
		double cevre = 2*pi*r;
		
		System.out.println("Dairenin alanı: " + alan);
		System.out.println("Dairenin çevresi: " + cevre);
		
		System.out.println("Spesifik açı değeri giriniz: ");
		alf = scan.nextInt();
		
		double alfAlan = (pi*r*r*alf)/360;
		
		System.out.println("Merkez açıya göre dairenin alanı: " + alfAlan);

	}
}