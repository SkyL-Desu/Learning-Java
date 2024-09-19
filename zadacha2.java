// Дана строка. Выведите в консоль длину этой строки.

import java.util.Scanner;
public class zadacha2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите строку: ");
        String str  = sc.nextLine();
        int length = str.length();
        System.out.println("Длина строки: " + length);
    }
}
