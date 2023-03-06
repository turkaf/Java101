import java.util.Scanner;

public class KullanıcıGirisi {

	public static void main(String[] args) {
		String userName, password, select, newPassword;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınız: ");
		userName = scan.nextLine(); 
		
		System.out.print("Şifreniz: ");
		password = scan.nextLine();
		
		if(userName.equals("patika") && password.equals("java123")) {
			System.out.println("Başarılı bir şekilde giriş yapıldı!");
		} else {
			System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (evet, hayır)");
			select = scan.nextLine();
			
			switch(select) {
			case "evet":
				System.out.print("Yeni şifrenizi giriniz! ");
				newPassword = scan.nextLine();
				if(newPassword.equals("java123")) {
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
				} else {
					System.out.println("Yeni şifre başarılı bir şekilde oluşturuldu!");
					password = newPassword;
				}
				break;
			case "hayır":
				System.out.println("İyi günler!");
				break;
			default:
				System.out.println("Geçersiz seçim!");
			}
		}

	}
}