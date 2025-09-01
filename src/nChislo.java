import java.util.Scanner;
public class nChislo {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите число для расчета суммы факториала ");
        int chislo =scanner.nextInt(); int sum =0;
        for (int i =0;i<=chislo;i++) sum+=i;
        System.out.println("Сумма равна " + sum);

    }
}
