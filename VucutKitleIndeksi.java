import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		double boy;
		int kilo;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		boy = scan.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		kilo = scan.nextInt();
		
		double indeks = kilo / (boy*boy);
		System.out.println("Vücut kitle indeksi: " + indeks);

	}
}