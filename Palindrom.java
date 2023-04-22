import java.util.Scanner;
public class Palindrom {
	
	static boolean isPalindrom(int n) {
		int temp, reverse = 0, last;
		temp = n;
		
		while(temp != 0) {
			last = temp%10;
			reverse = (reverse * 10) + last;
			temp /= 10;
		}
		
		if(reverse == n) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int input;
		
		System.out.print("Sayı giriniz: ");
		
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		System.out.println(isPalindrom(input));
	}
}