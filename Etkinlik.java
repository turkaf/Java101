import java.util.Scanner;

public class Etkinlik {

	public static void main(String[] args) {
		int heat;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sıcaklık değeri giriniz: ");
		heat = scan.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz!");
		} else if(heat>=5 && heat<10) {
			System.out.println("Sinemaya gidebilirsiniz!");
		} else if(heat>=10 && heat<=15) {
			System.out.println("Sinemaya gidebilirsiniz!");
			System.out.println("Pikniğe gidebilirsiniz!");
		} else {
			System.out.println("Yüzmeye gidebilirsiniz!");
		}
	}
}