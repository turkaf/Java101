import java.util.Scanner;
public class Us {

	static int power(int num, int pow) {

		if(pow == 0) {
			return 1;
		}else if(pow == 1) {
			return num;
		}
		return power(num, pow-1)*num;
	}
	
	public static void main(String[] args) {
		int num, pow;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Sayı giriniz: ");
		num = scan.nextInt();
		
		System.out.print("Üs giriniz: ");
		pow = scan.nextInt();
		
		System.out.println(power(num, pow));
	}
}