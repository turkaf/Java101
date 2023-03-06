import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		int km, yas, yon;
		double perCost = 0.10, tutar;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Mesafeyi giriniz: ");
		km = scan.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		yas = scan.nextInt();
		
		System.out.print("Yolculuk tipini seçiniz (Tek yön: 1, Gidiş - Dönüş: 2): ");
		yon = scan.nextInt();
		
		tutar = km*perCost;
		
		switch(yon) {
		case 1:
			if(yas>=0 && yas<12) {
				tutar *= 0.5;
			}else if(yas>=12 && yas<=24) {
				tutar *= 0.9;
			}else if(yas>=65) {
				tutar *= 0.7;
			}
			break;
		case 2:
			if(yas>=0 && yas<12) {
				tutar *= 0.5;
				tutar *= 0.8;
				tutar *= 2;
			}else if(yas>=12 && yas<=24) {
				tutar *= 0.9;
				tutar *= 0.8;
				tutar *= 2;
			}else if(yas>=65) {
				tutar *= 0.7;
				tutar *= 0.8;
				tutar *= 2;
			}else {
				tutar = 2*tutar*0.8;
			}
			break;
		default:
			System.out.println("Geçersiz değer girdiniz!");
		}
		
		System.out.println("Toplam tutar: " + tutar);
	}
}