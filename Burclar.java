import java.util.Scanner;

public class Burclar {

	public static void main(String[] args) {
		int month, day;
		String burc = "";
		boolean isInvalid = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Doğduğunuz ayı giriniz: ");
		month = scan.nextInt();
		
		System.out.print("Doğduğunuz ayı giriniz: ");
		day = scan.nextInt();
		
		if(month == 1) {
			if(day>=1 && day<=31) {
				if(day<=21) {
					burc = "Oğlak";
				}else {
					burc = "Kova";
				}
			} else {
				isInvalid = true;
			}
		} else if (month == 2){
			if(day>=1 && day<=28) {
				if(day<=19) {
					burc = "Kova";
				}else {
					burc = "Balık";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 3){
			if(day>=1 && day<=31) {
				if(day<=20) {
					burc = "Balık";
				}else {
					burc = "Koç";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 4){
			if(day>=1 && day<=30) {
				if(day<=20) {
					burc = "Koç";
				}else {
					burc = "Boğa";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 5){
			if(day>=1 && day<=31) {
				if(day<=22) {
					burc = "Boğa";
				}else {
					burc = "İkizler";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 6){
			if(day>=1 && day<=30) {
				if(day<=23) {
					burc = "İkizler";
				}else {
					burc = "Yengeç";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 7){
			if(day>=1 && day<=31) {
				if(day<=23) {
					burc = "Yengeç";
				}else {
					burc = "Aslan";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 8){
			if(day>=1 && day<=31) {
				if(day<=23) {
					burc = "Aslan";
				}else {
					burc = "Başak";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 9){
			if(day>=1 && day<=33) {
				if(day<=23) {
					burc = "Başak";
				}else {
					burc = "Terazi";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 10){
			if(day>=1 && day<=31) {
				if(day<=23) {
					burc = "Terazi";
				}else {
					burc = "Akrep";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 11){
			if(day>=1 && day<=30) {
				if(day<=22) {
					burc = "Akrep";
				}else {
					burc = "Yay";
				}
			} else {
				isInvalid = true;
			}
		}else if (month == 12){
			if(day>=1 && day<=31) {
				if(day<=22) {
					burc = "Yay";
				}else {
					burc = "Oğlak";
				}
			} else {
				isInvalid = true;
			}
		}
		
		if(isInvalid) {
			System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz!");
		}else {
			System.out.println("Burcunuz: " + burc);
		}
	}
}