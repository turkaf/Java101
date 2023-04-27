
public class Transpoz {

	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println("Matris:");
		for(int[] row: arr){
            for(int column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
		
		System.out.println("Transpoz:");
        int column = arr[0].length;
        for(int i=0; i < column; i++){
            for(int j=0; j < arr.length; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
	}
}