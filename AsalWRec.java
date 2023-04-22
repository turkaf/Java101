import java.util.Scanner;

public class AsalWRec {
    static String isPrime(int value, int divider, int divisor) {
        int remainder = value % divider;
        if (remainder == 0) {
            divisor ++;
        }
        if (divider == 1){
            if (divisor > 2){
                return value + " asal DEĞİLDİR.";
            }else {
                return value + " asaldır.";
            }
        }
        return isPrime(value,divider - 1, divisor);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Sayı giriniz: ");
            int value = input.nextInt();

            if(value > 1) {
                System.out.print(isPrime(value,value,0));
                break;
            }else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
            }
        }
    }
}