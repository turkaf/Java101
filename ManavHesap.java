import java.util.Scanner;

public class ManavHesap {

	public static void main(String[] args) {
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;
		double arKil, elKil, domKil, muzKil, patKil;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Armut kaç kilo? ");
		arKil = scan.nextDouble();
		
		System.out.print("Elma kaç kilo? ");
		elKil = scan.nextDouble();
		
		System.out.print("Domates kaç kilo? ");
		domKil = scan.nextDouble();
		
		System.out.print("Muz kaç kilo? ");
		muzKil = scan.nextDouble();
		
		System.out.print("Patlıcan kaç kilo? ");
		patKil = scan.nextDouble();
		
		double toplam = (armut*arKil) + (elma*elKil) + (domates*domKil) + (muz*muzKil) + (patlıcan*patKil);
		
		System.out.println("Toplam tutar: " + toplam + " ₺");

	}

}
