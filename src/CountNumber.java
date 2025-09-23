import java.util.Scanner;

public class CountNumber {
    // Создание массива для метода и подсчета четных числе в это массиве
    static double enterEvenNumbers(){// метод созданный
        Scanner scanner = new Scanner(System.in);
        int [] num = new int[10]; // СОЗДАННЫЙ МАССИВ ДЛЯ ЗАПИСИ ЧИСЕЛ
        for (int i=0;i<num.length;i++){  // ЦИКЛ ДЛЯ ЗАПИСИ  В МАССИВ
            System.out.println("Сумма"+(i+1)+':'); // ВЫВОД МАССИВА
            num[i]=scanner.nextByte();// ЗАПИСЬ В МААССИВ
        }
        return num.length; // ВОЗВРАЩАЕМ КОЛЛИЧЕСВО СИМВОЛОВ
    }
    static double countNumbers(int eventNumber){//  метод для определения четности
        int count = 0;
        for ()
        if (eventNumber % 2 == 0) {
            count++;
        }
        return ;
    }
    public static void main(String[] args) {

        System.out.println(enterEvenNumbers());

    }
}
