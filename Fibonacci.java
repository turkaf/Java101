import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int numOfElement, firstVal = 0, secondVal = 1, total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Eleman sayısı giriniz: ");
		numOfElement = scan.nextInt();
		
		int i = 0;
		do {
			System.out.print(firstVal + " ");
			total = firstVal + secondVal;
			firstVal = secondVal;
			secondVal = total;
			i++;
		}while(i<=numOfElement);
	}
}