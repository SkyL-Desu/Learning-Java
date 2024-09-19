// Даны два слова. Проверьте, что первые буквы этих слов совпадают.

import java.util.Scanner;
public class zadacha5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите два слова: ");
        String a = sc.nextLine();
        String b = sc.nextLine();
        char a1 = a.charAt(0);
        char b1 = b.charAt(0);
        if (Character.toLowerCase(a1) == Character.toLowerCase(b1)){
            System.out.println("Первые буквы слов совпадают.");
        } else {
            System.out.println("Первые буквы этих слов не совпадают.");
        }

    }
}
