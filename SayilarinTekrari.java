import java.util.Arrays;

public class SayilarinTekrari {

	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		
		System.out.println("Dizi: " + Arrays.toString(arr));
		
		System.out.println("Tekrar Sayıları");
		System.out.println("---------------");
		
		for(int i = 0; i<arr.length; i++) {
			
			int count = 0;
			boolean isCount = false;
			
			for(int k = i-1; k>=0; --k) {
				if(arr[k]==arr[i]) {
					isCount = true;
					break;
				}
			}
			
			if(!isCount) {
				for(int j = 0; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						count++;
					}
				}
			}
			
			if(count >= 1) {
				System.out.println(arr[i] + " sayısı " + count + " kere tekrar edildi.");
			}
		}
	}
}