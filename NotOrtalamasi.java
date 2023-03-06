import java.util.Scanner;

public class NotOrtalamasi {

	public static void main(String[] args) {
		int mat, fizik, turkce, kimya, muzik, toplam = 5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Matematik notunuz: ");
		mat = scan.nextInt();
		
		if((mat < 0) || (mat > 100)) {
			mat = 0;
			toplam -= 1;
		}
		
		System.out.print("Fizik notunuz: ");
		fizik = scan.nextInt();
		
		if((fizik < 0) || (fizik > 100)) {
			fizik = 0;
			toplam -= 1;
		}
		
		System.out.print("Türkçe notunuz: ");
		turkce = scan.nextInt();
		
		if((turkce < 0) || (turkce > 100)) {
			turkce = 0;
			toplam -= 1;
		}
		
		System.out.print("Kimya notunuz: ");
		kimya = scan.nextInt();
		
		if((kimya < 0) || (kimya > 100)) {
			kimya = 0;
			toplam -= 1;
		}
		
		System.out.print("Müzik notunuz: ");
		muzik = scan.nextInt();
		
		if((muzik < 0) || (muzik > 100)) {
			muzik = 0;
			toplam -= 1;
		}
		
		
		double average = 0;
		
		if(toplam != 0) {
			average = (mat + fizik + turkce + kimya + muzik) / toplam;
		} else {
			average = 0;
		}
		
		if(average <= 55) {
			System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
		} else {
			System.out.println("Tebrikler, sınıfı geçtiniz!");
		}
		
		System.out.println("Ortalamanız: " + average);

	}
}