
public class HarmonikDizi {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		
		double sum = 0.0;
		
		for(int i = 0; i<arr.length; i++) {
			sum += (1/(double)arr[i]);
		}
		
		double harAv = arr.length/sum;
		
		System.out.println(harAv);

	}

}
