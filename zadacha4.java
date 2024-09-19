// Дано число. Проверьте, четное оно или нет.

import java.util.Scanner;
public class zadacha4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите число: ");
        int a = sc.nextInt();
        if (a % 2==0) {
            System.out.println("Число четное.");
        } else{
            System.out.println("Число нечетное.");
        }

    }

}
