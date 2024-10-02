// Абстрактний клас Number, що визначає методи для арифметичних операцій
abstract class Number {
    // Абстрактні методи для арифметичних операцій
    public abstract Number add(Number other);
    public abstract Number subtract(Number other);
    public abstract Number multiply(Number other);
    public abstract Number divide(Number other);
}

// Клас IntegerNumber, який є похідним класом від Number
class IntegerNumber extends Number {
    private int value; // Поле для зберігання цілого числа

    // Конструктор для ініціалізації значення
    public IntegerNumber(int value) {
        this.value = value; // Присвоює значення полю
    }

    // Реалізація методу add для додавання цілого числа
    @Override
    public IntegerNumber add(Number other) {
        if (other instanceof IntegerNumber) { // Перевірка типу
            IntegerNumber o = (IntegerNumber) other; // Приведення типу
            return new IntegerNumber(this.value + o.value); // Повертає новий об'єкт
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Реалізація методу subtract для віднімання цілого числа
    @Override
    public IntegerNumber subtract(Number other) {
        if (other instanceof IntegerNumber) { // Перевірка типу
            IntegerNumber o = (IntegerNumber) other; // Приведення типу
            return new IntegerNumber(this.value - o.value); // Повертає новий об'єкт
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Реалізація методу multiply для множення цілого числа
    @Override
    public IntegerNumber multiply(Number other) {
        if (other instanceof IntegerNumber) { // Перевірка типу
            IntegerNumber o = (IntegerNumber) other; // Приведення типу
            return new IntegerNumber(this.value * o.value); // Повертає новий об'єкт
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Реалізація методу divide для ділення цілого числа
    @Override
    public IntegerNumber divide(Number other) {
        if (other instanceof IntegerNumber) { // Перевірка типу
            IntegerNumber o = (IntegerNumber) other; // Приведення типу
            if (o.value != 0) { // Перевірка на ділення на нуль
                return new IntegerNumber(this.value / o.value); // Повертає новий об'єкт
            }
            throw new ArithmeticException("Division by zero"); // Викидає виняток при діленні на нуль
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Метод для представлення об'єкта у вигляді рядка
    @Override
    public String toString() {
        return Integer.toString(value); // Повертає значення у рядковому форматі
    }

    // Перевизначення методу equals для порівняння об'єктів
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Перевірка на однаковість
        if (obj == null || getClass() != obj.getClass()) return false; // Перевірка на null і клас
        IntegerNumber that = (IntegerNumber) obj; // Приведення типу
        return value == that.value; // Порівняння значень
    }
}

// Клас RealNumber, який є похідним класом від Number
class RealNumber extends Number {
    private double value; // Поле для зберігання дійсного числа

    // Конструктор для ініціалізації значення
    public RealNumber(double value) {
        this.value = value; // Присвоює значення полю
    }

    // Реалізація методу add для додавання дійсного числа
    @Override
    public RealNumber add(Number other) {
        if (other instanceof RealNumber) { // Перевірка типу
            RealNumber o = (RealNumber) other; // Приведення типу
            return new RealNumber(this.value + o.value); // Повертає новий об'єкт
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Реалізація методу subtract для віднімання дійсного числа
    @Override
    public RealNumber subtract(Number other) {
        if (other instanceof RealNumber) { // Перевірка типу
            RealNumber o = (RealNumber) other; // Приведення типу
            return new RealNumber(this.value - o.value); // Повертає новий об'єкт
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Реалізація методу multiply для множення дійсного числа
    @Override
    public RealNumber multiply(Number other) {
        if (other instanceof RealNumber) { // Перевірка типу
            RealNumber o = (RealNumber) other; // Приведення типу
            return new RealNumber(this.value * o.value); // Повертає новий об'єкт
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Реалізація методу divide для ділення дійсного числа
    @Override
    public RealNumber divide(Number other) {
        if (other instanceof RealNumber) { // Перевірка типу
            RealNumber o = (RealNumber) other; // Приведення типу
            if (o.value != 0) { // Перевірка на ділення на нуль
                return new RealNumber(this.value / o.value); // Повертає новий об'єкт
            }
            throw new ArithmeticException("Division by zero"); // Викидає виняток при діленні на нуль
        }
        return null; // Повертає null, якщо тип не збігається
    }

    // Метод для представлення об'єкта у вигляді рядка
    @Override
    public String toString() {
        return Double.toString(value); // Повертає значення у рядковому форматі
    }

    // Перевизначення методу equals для порівняння об'єктів
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Перевірка на однаковість
        if (obj == null || getClass() != obj.getClass()) return false; // Перевірка на null і клас
        RealNumber that = (RealNumber) obj; // Приведення типу
        return Double.compare(that.value, value) == 0; // Порівняння значень
    }
}

// Основний клас для демонстрації роботи
public class AbstractNumberDemo {
    public static void main(String[] args) {
        // Головний метод програми
        System.out.println("Lab 3 - Abstract Classes and Methods"); // Виводить назву лабораторної роботи

        Number intNum1 = new IntegerNumber(10); // Створює об'єкт цілого числа
        Number intNum2 = new IntegerNumber(20); // Створює ще один об'єкт цілого числа

        Number realNum1 = new RealNumber(5.5); // Створює об'єкт дійсного числа
        Number realNum2 = new RealNumber(2.2); // Створює ще один об'єкт дійсного числа

        // Демонстрація роботи методів для цілих чисел
        System.out.println("Integer Add: " + intNum1.add(intNum2)); // Виводить результат додавання
        System.out.println("Integer Subtract: " + intNum1.subtract(intNum2)); // Виводить результат віднімання

        // Демонстрація роботи методів для дійсних чисел
        System.out.println("Real Multiply: " + realNum1.multiply(realNum2)); // Виводить результат множення
        System.out.println("Real Divide: " + realNum1.divide(realNum2)); // Виводить результат ділення

        // Демонстрація роботи методу equals
        System.out.println("Integer Equals: " + intNum1.equals(intNum2)); // Виводить результат порівняння цілих чисел
        System.out.println("Real Equals: " + realNum1.equals(realNum2)); // Виводить результат порівняння дійсних чисел
    }
}
