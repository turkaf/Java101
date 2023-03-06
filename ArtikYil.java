import java.util.Scanner;

public class ArtikYil {

	public static void main(String[] args) {
		int yil;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Yıl giriniz: ");
		yil = scan.nextInt();
		
		if((yil%4)==0) {
			if((yil%100) == 0 && (yil%400) != 0) {
				System.out.println(yil + " bir artık yıldır değildir!");
			}else {
				System.out.println(yil + " bir artık yıldır!");
			}
		}else {
			System.out.println(yil + " bir artık yıldır değildir!");
		}

	}
}