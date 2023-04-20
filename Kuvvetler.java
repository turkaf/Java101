import java.util.Scanner;
public class Kuvvetler {

	public static void main(String[] args) {
		
		int input;
		Scanner scan = new Scanner(System.in);
	    System.out.print("Sayı giriniz : ");
	    input = scan.nextInt();
	    
	    System.out.println("4'ün kuvvetleri:" + "\t" + "\t 5'in kuvvetleri:");
	    System.out.println("-------------------------------------------------");
	    for (int i = 1, j = 1; i <= input && j <= input; i *= 4, j *= 5) {
	        System.out.println(i + " \t\t-\t\t " + j);
	        }
	}
}