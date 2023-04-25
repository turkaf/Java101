import java.util.Arrays;
import java.util.Scanner;
public class DiziSiralama {

	public static void main(String[] args) {
		int n, numbers;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin boyutu n: ");
		n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz:");
		
		for(int i = 0; i<n; i++) {
			System.out.print(i+1 + ". eleman: ");
			numbers = scan.nextInt();
			arr[i] = numbers;
		}
		
		Arrays.sort(arr);
		
		System.out.println("Sıralama: " + Arrays.toString(arr));

	}

}
