import java.util.Scanner;
public class ObebOkek {

	public static void main(String[] args) {
		int n1, n2, smallNum, bigNum;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1. sayıyı giriniz: ");
		n1 = scan.nextInt();
		
		System.out.print("2. sayıyı giriniz: ");
		n2 = scan.nextInt();
		
		if(n1<n2) {
			smallNum = n1;
			bigNum = n2;
		}else {
			smallNum = n2;
			bigNum = n1;
		}
		
		while(n1%smallNum != 0 || n2%smallNum != 0) {
			smallNum--;
		}
		
		System.out.println("Obeb: " + smallNum);
		
		while(bigNum<n1*n2) {
			if(bigNum%n1 == 0 && bigNum%n2 == 0) {
				System.out.println("Okek: " + bigNum);
				break;
			}else {
				bigNum++;
			}
		}
	}
}