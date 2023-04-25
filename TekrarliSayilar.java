import java.util.Arrays;

public class TekrarliSayilar {
	
	static boolean isFound(int[] list, int value) {
		
		for(int i: list) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr = {2,5,8,7,9,6,2,4,2,7,2,8,4,4,9,6,6};
		
		int[] dup = new int[arr.length];
		int startIndex = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if((i != j) && (arr[i] == arr[j]) && (arr[i]%2 == 0)) {
					if(!isFound(dup, arr[i])) {
						dup[startIndex++] = arr[i];
						break;
					}

				}
			}
		}
		for(int value: dup) {
			if(value != 0) {
				System.out.print(value + " ");
			}
		}
	}
}