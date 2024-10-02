// Основний клас для запуску програми
public class InterfaceNumberDemo {

    // Інтерфейс для арифметичних операцій
    interface MyNumber {
        MyNumber add(MyNumber other); // Метод для додавання
        MyNumber subtract(MyNumber other); // Метод для віднімання
        MyNumber multiply(MyNumber other); // Метод для множення
        MyNumber divide(MyNumber other); // Метод для ділення
    }

    // Клас для цілих чисел
    static class IntegerNumber implements MyNumber {
        private int value; // Значення цілого числа

        // Конструктор для ініціалізації цілого числа
        public IntegerNumber(int value) {
            this.value = value; // Присвоює значення полю
        }

        // Реалізація методу додавання
        @Override
        public MyNumber add(MyNumber other) {
            if (other instanceof IntegerNumber) { // Перевірка типу
                IntegerNumber o = (IntegerNumber) other; // Приведення типу
                return new IntegerNumber(this.value + o.value); // Повертає новий об'єкт
            }
            return null; // Якщо тип не співпадає
        }

        // Реалізація методу віднімання
        @Override
        public MyNumber subtract(MyNumber other) {
            if (other instanceof IntegerNumber) { // Перевірка типу
                IntegerNumber o = (IntegerNumber) other; // Приведення типу
                return new IntegerNumber(this.value - o.value); // Повертає новий об'єкт
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Реалізація методу множення
        @Override
        public MyNumber multiply(MyNumber other) {
            if (other instanceof IntegerNumber) { // Перевірка типу
                IntegerNumber o = (IntegerNumber) other; // Приведення типу
                return new IntegerNumber(this.value * o.value); // Повертає новий об'єкт
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Реалізація методу ділення
        @Override
        public MyNumber divide(MyNumber other) {
            if (other instanceof IntegerNumber) { // Перевірка типу
                IntegerNumber o = (IntegerNumber) other; // Приведення типу
                if (o.value != 0) { // Перевірка на ділення на нуль
                    return new IntegerNumber(this.value / o.value); // Повертає новий об'єкт
                }
                System.out.println("Помилка: Ділення на нуль!"); // Повідомлення про помилку
                return null; // Повертає null при діленні на нуль
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Метод для виводу значення
        @Override
        public String toString() {
            return Integer.toString(value); // Повертає значення у рядковому форматі
        }

        // Метод equals
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // Перевірка на однаковість
            if (!(obj instanceof IntegerNumber)) return false; // Перевірка типу
            IntegerNumber other = (IntegerNumber) obj; // Приведення типу
            return this.value == other.value; // Перевірка значення
        }
    }

    // Клас для дійсних чисел
    static class RealNumber implements MyNumber {
        private double value; // Значення дійсного числа

        // Конструктор для ініціалізації дійсного числа
        public RealNumber(double value) {
            this.value = value; // Присвоює значення полю
        }

        // Реалізація методу додавання
        @Override
        public MyNumber add(MyNumber other) {
            if (other instanceof RealNumber) { // Перевірка типу
                RealNumber o = (RealNumber) other; // Приведення типу
                return new RealNumber(this.value + o.value); // Повертає новий об'єкт
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Реалізація методу віднімання
        @Override
        public MyNumber subtract(MyNumber other) {
            if (other instanceof RealNumber) { // Перевірка типу
                RealNumber o = (RealNumber) other; // Приведення типу
                return new RealNumber(this.value - o.value); // Повертає новий об'єкт
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Реалізація методу множення
        @Override
        public MyNumber multiply(MyNumber other) {
            if (other instanceof RealNumber) { // Перевірка типу
                RealNumber o = (RealNumber) other; // Приведення типу
                return new RealNumber(this.value * o.value); // Повертає новий об'єкт
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Реалізація методу ділення
        @Override
        public MyNumber divide(MyNumber other) {
            if (other instanceof RealNumber) { // Перевірка типу
                RealNumber o = (RealNumber) other; // Приведення типу
                if (o.value != 0) { // Перевірка на ділення на нуль
                    return new RealNumber(this.value / o.value); // Повертає новий об'єкт
                }
                System.out.println("Помилка: Ділення на нуль!"); // Повідомлення про помилку
                return null; // Повертає null при діленні на нуль
            }
            return null; // Повертає null, якщо тип не співпадає
        }

        // Метод для виводу значення
        @Override
        public String toString() {
            return Double.toString(value); // Повертає значення у рядковому форматі
        }

        // Метод equals
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // Перевірка на однаковість
            if (!(obj instanceof RealNumber)) return false; // Перевірка типу
            RealNumber other = (RealNumber) obj; // Приведення типу
            return Double.compare(this.value, other.value) == 0; // Перевірка значення
        }
    }

    // Головний метод для запуску програми
    public static void main(String[] args) {
        System.out.println("Лабораторна робота 3 - Iнтерфейси та методи"); // Виводить назву лабораторної роботи

        // Створюємо об'єкти цілих чисел
        MyNumber intNum1 = new IntegerNumber(10); // Об'єкт 1
        MyNumber intNum2 = new IntegerNumber(20); // Об'єкт 2

        // Створюємо об'єкти дійсних чисел
        MyNumber realNum1 = new RealNumber(5.5); // Об'єкт 1
        MyNumber realNum2 = new RealNumber(2.2); // Об'єкт 2

        // Виконуємо арифметичні операції з цілими числами
        System.out.println("Сума цiлих чисел: " + intNum1.add(intNum2)); // Виводить суму
        System.out.println("Рiзниця цiлих чисел: " + intNum1.subtract(intNum2)); // Виводить різницю

        // Виконуємо арифметичні операції з дійсними числами
        System.out.println("Добуток дiйсних чисел: " + realNum1.multiply(realNum2)); // Виводить добуток
        System.out.println("Частка дiйсних чисел: " + realNum1.divide(realNum2)); // Виводить частку

        // Перевірка методів toString
        System.out.println("Цiле число 1: " + intNum1); // Виводить значення цілого числа
        System.out.println("Дiйсне число 1: " + realNum1); // Виводить значення дійсного числа

        // Перевірка методів equals
        MyNumber intNum3 = new IntegerNumber(10); // Новий об'єкт
        System.out.println("intNum1 дорівнює intNum3: " + intNum1.equals(intNum3)); // Виводить true
    }
}
