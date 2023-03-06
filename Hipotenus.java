import java.util.Scanner;

public class Hipotenus {

	public static void main(String[] args) {
		int a, b;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("1. Kenarı Giriniz: ");
		a = scan.nextInt();
		
		System.out.print("2. Kenarı Giriniz: ");
		b = scan.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenüs: " + c);
		
		double cevre = a + b + c;
		System.out.println("Çevre: " + cevre);
		
		double u = cevre/2;
		
		double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Alan: " + alan);

	}
}