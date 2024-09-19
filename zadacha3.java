// Дана строка. Выведите в консоль последний символ строки.

import java.util.Scanner;
public class zadacha3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите строку: ");
        String str  = sc.nextLine();
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));
}
}