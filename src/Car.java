// Класс — шаблон
public class Car {
    // Состояние (поля)
    String brand;
    int year;

    // Поведение (методы)
    void startEngine() {
        System.out.println(brand + " engine started.");
    }
}

// Создание объектов
 class Main {
    public static void main(String[] args) {
        // Объект 1
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2020;

        // Объект 2
        Car yourCar = new Car();
        yourCar.brand = "BMW";
        yourCar.year = 2023;

        myCar.startEngine();   // Вывод: Toyota engine started.
        yourCar.startEngine(); // Вывод: BMW engine started.
    }
}