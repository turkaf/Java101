import java.util.Scanner;
public class UsAlma {

	public static void main(String[] args) {
		int input;
		
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(input + " x " + i + " = " + input*i);
		}
	}
}