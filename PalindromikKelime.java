import java.util.*;
public class PalindromikKelime {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Kelimeyi giriniz: ");
    	String input = scan.nextLine();
    	
        System.out.println(isPalindrome2(input));
    }
}