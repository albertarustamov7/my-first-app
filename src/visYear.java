import java.util.Scanner;
public class visYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Person input int
        System.out.println("input year ");
        int year  = scanner.nextInt();
        if((year % 4==0)&&(year%100!=0)||(year % 400==0)){
            System.out.println("It's true");
        }else {
            System.out.println("not true");
        }
    }
}
