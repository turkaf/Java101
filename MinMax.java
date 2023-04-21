import java.util.Scanner;
public class MinMax {

	public static void main(String[] args) {
		int N, input, max = 0, min = 0, temp = 0, temp2 = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen kaç adet sayı gireceğinizi yazınız: ");
		N = scan.nextInt();
		
		for(int i = 1; i<=N; i++) {
			System.out.print(i + ". sayıyı giriniz: ");
			input = scan.nextInt();
			
			if(i==1) {
				min = input;
				max = input;
			}else {
				if(input>max) {
					max = input;
				}
				if(input<min) {
					min = input;
				}
			}
		}
		System.out.println("En büyük sayı: " + max);
		System.out.println("En küçük sayı: " + min);
	}
}