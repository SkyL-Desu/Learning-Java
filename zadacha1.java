// Дано число. Проверьте, отрицательное оно или нет. Выведите об этом информацию в консоль.

import java.util.Scanner;
public class zadacha1 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("\nВведите число: ");
    int a = sc.nextInt();
    if (a >= 0) {
        System.out.println("\nЧисло положительное");
    } else {
        System.out.println("\nЧисло отрицательное");
    }
    }
}