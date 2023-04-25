
public class BHarfi {

	public static void main(String[] args) {
		String[][] arr = new String[5][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				if((i == 0 && j != 3) || i == 2 || (i == 4 && j != 3)) {
					arr[i][j] = " * ";
				}else if(j == 0 || (j == 3 && i != 2) || (j == 3 && i != 4)) {
					arr[i][j] = " * ";
				}else {
					arr[i][j] = "   ";
				}
			}
		}
		
		arr[0][3] = "   ";
		arr[2][3] = "   ";
		arr[4][3] = "   ";
		
		for(String[] row: arr) {
			for(String col: row) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}