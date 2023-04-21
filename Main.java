import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        int total, multiplication = 0;
        
        for(int i=0;i<t;i++){
        	int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
        	for(int j = 0; j<n; j++) {
            	multiplication += (int)(Math.pow(2, j))*b;
            	total = a + multiplication;
            	System.out.print(total + " ");
            }
        	multiplication = 0;
        	System.out.println();
        }
	}
}