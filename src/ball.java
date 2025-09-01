import java.util.Scanner;
public class ball {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        if (score >= 90) System.out.println("Отлично");
        else if (score >= 70) System.out.println("Хорошо");
        else if (score >= 50) System.out.println("Удовл.");
        else System.out.println("Неуд.");
    }
}
