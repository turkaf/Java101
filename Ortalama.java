import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, tar, muz;

        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = scan.nextInt();

        System.out.print("Fizik notunuz: ");
        fiz = scan.nextInt();

        System.out.print("Kimya notunuz: ");
        kim = scan.nextInt();

        System.out.print("Türkçe notunuz: ");
        tur = scan.nextInt();

        System.out.print("Tarih notunuz: ");
        tar = scan.nextInt();

        System.out.print("Müzik notunuz: ");
        muz = scan.nextInt();

        int toplam = (mat+fiz+kim+tur+tar+muz);
        double sonuc = toplam / 6;
        System.out.println("Ortalama: " + sonuc);

        String str = sonuc>60 ? "Sınıfı geçti." : "Sınıfta Kaldı";
        System.out.println(str);

    }
}
