import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		String userName = "patika", password = "dev123";
		Scanner scan = new Scanner(System.in);
		
		int right = 3, balance = 1500, select;
		
		while(right>0) {
			System.out.print("Kullanıcı adınız: ");
			userName = scan.nextLine();
			
			System.out.print("Şifreniz: ");
			password = scan.nextLine();
			
			if(userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Giriş başarılı.");
				do {
					System.out.println("1- Para yatırma\n" + "2- Para çekme\n" + 
					"3- Bakiye sorgulama\n" + "4- Çıkış");
					System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
					select = scan.nextInt();
					switch(select) {
					case 1:
						System.out.print("Yatırılacak tutarı giriniz: ");
						int price = scan.nextInt();
						balance += price;
						System.out.println("Yeni bakiye: " + balance);
						break;
					case 2:
						System.out.print("Çekilecek tutarı giriniz: ");
						price = scan.nextInt();
						if(price > balance) {
							System.out.println("Yetersiz bakiye!");
						}else {
							balance -= price;
							System.out.println("Yeni bakiye: " + balance);
						}
						break;
					case 3:
						System.out.println("Güncel bakiye: " + balance);
						break;
					}
				}while(select != 4);
				break;
			}else {
				right--;
				System.out.println("Hatalı kullanıcı adı veya şifre. Lütfen tekrar deneyiniz!");
				if(right == 0) {
					System.out.println("Hesabınız bloke olmuştur!");
				}else {
					System.out.println("Kalan hakkınız: " + right);
				}
			}
		}
	}
}