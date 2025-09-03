import java.util.Scanner;
class test5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int n = scanner.nextInt(), rev=0;
        while (n>0){
            rev = rev * 10+n%10;
            n/=10;
        }
        System.out.println(rev);
    }
}