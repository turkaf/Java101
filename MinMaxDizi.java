import java.util.Scanner;
import java.util.Arrays;
public class MinMaxDizi {

	public static void main(String[] args) {
		int[] arr = {15,12,788,1,-1,-778,2,0};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		int input = scan.nextInt();
		int min = 0, max = 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i<arr.length; i++) {
			min = arr[i];
			if(arr[i]>input) {
				min = arr[i-1];
				break;
			}
		}
		
		for(int i = arr.length-1; i>=0; i--) {
			max = arr[i];
			if(arr[i]<input) {
				max = arr[i+1];
				break;
			}
		}
		
		System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
		System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);
	}
}