
// Программа на ввод пароль и логина
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        // Условные конструкции if-else
        Scanner scanner = new Scanner(System.in);
        //Блок орентированный на ввод Логина
        System.out.println("Здравствуйте! Введите роль");
        String role = scanner.nextLine();
        if (role.equals("Admin")) {
            // Блок орентированый на ввод пароля
            System.out.println("Введите пароль");
            int pass = scanner.nextInt();
            if (pass == 123)
                System.out.println("Добро пожаловать");
            /* В случае если пользователь не
            опознан, его просят ввести имя
            после чего завершается программа
             */
            }else {
                System.out.println("Похоже, что Вы ранее не были зарегестророваны, введите свое имя ");
                String name = scanner.nextLine();
                System.out.println("Здравсвуйсте " + name + "Мы рады что вы выбрали нас");
        }
    }
}
