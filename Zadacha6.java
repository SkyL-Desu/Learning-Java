//Дано слово. Получите его последнюю букву. Если слово заканчивается на букву w то получите предпоследнюю букву.
 import java.nio.charset.StandardCharsets;
 import java.util.Scanner;
public class Zadacha6 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("\nВведите слово: ");
    String str = sc.nextLine();
    if (str.charAt(str.length()-1) == 'w'){
        System.out.println("Последняя буква: " + str.charAt(str.length()-2));
    } else{
        System.out.println("Последняя буква: " + str.charAt(str.length()-1)); 
}
}
}