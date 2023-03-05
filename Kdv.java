import java.util.Scanner;

public class Kdv {

	public static void main(String[] args) {
		double tutar, kdvOran1 = 0.18, kdvOran2 = 0.08, kdvTutar1, kdvTutar2, kdvliTutar1, kdvliTutar2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Tutar giriniz: ");
		tutar = scan.nextDouble();
		
		kdvTutar1 = tutar * kdvOran1;
		kdvTutar2 = tutar * kdvOran2;
		
		kdvliTutar1 = tutar + kdvTutar1;
		kdvliTutar2 = tutar + kdvTutar2;
		
		System.out.println("KDV'siz tutar: " + tutar);
		System.out.println("KDV oranı 1: " + kdvOran1 + ", " + "KDV oranı 2: " + kdvOran2);
		double str1 = (tutar>=0 && tutar<=1000) ? kdvTutar1 : kdvTutar2;
		System.out.println("KDV tutarı: " + str1);
		
		double str2 = (tutar>=0 && tutar<=1000) ? kdvliTutar1 : kdvliTutar2;
		System.out.println("KDV'li tutar: " + str2);

	}
}