import java.util.Scanner;
public class Desen {
	
	
	static void plusPattern(int num, int temp) {
		if(num > 0) {
			System.out.print(num + " ");
			plusPattern(num - 5, temp);
		}else if(num <= 0) {
			minusPattern(num, temp);
		}
	}
	
	static void minusPattern(int num, int temp) {
		if(temp >= num) {
			System.out.print(num + " ");
			minusPattern(num + 5, temp);
		}
	}

	public static void main(String[] args) {
		int input, temp;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		input = scan.nextInt();
		temp = input;
		
		plusPattern(input, temp);
	}
}