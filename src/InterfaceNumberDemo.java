// Основний клас для запуску програми
public class InterfaceNumberDemo {
    
    // Інтерфейс для арифметичних операцій
    interface MyNumber {
        MyNumber add(MyNumber other);
        MyNumber subtract(MyNumber other);
        MyNumber multiply(MyNumber other);
        MyNumber divide(MyNumber other);
    }

    // Клас для цілих чисел
    static class IntegerNumber implements MyNumber {
        private int value; // Значення цілого числа

        // Конструктор для ініціалізації цілого числа
        public IntegerNumber(int value) {
            this.value = value;
        }

        // Реалізація методу додавання
        @Override
        public MyNumber add(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other; // Приведення типу
                return new IntegerNumber(this.value + o.value);
            }
            return null; // Якщо тип не співпадає
        }

        // Інші методи (віднімання, множення, ділення)
        @Override
        public MyNumber subtract(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                return new IntegerNumber(this.value - o.value);
            }
            return null;
        }

        @Override
        public MyNumber multiply(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                return new IntegerNumber(this.value * o.value);
            }
            return null;
        }

        @Override
        public MyNumber divide(MyNumber other) {
            if (other instanceof IntegerNumber) {
                IntegerNumber o = (IntegerNumber) other;
                if (o.value != 0) {
                    return new IntegerNumber(this.value / o.value);
                }
                System.out.println("Помилка: Ділення на нуль!");
                return null;
            }
            return null;
        }

        // Метод для виводу значення
        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }

    // Клас для дійсних чисел
    static class RealNumber implements MyNumber {
        private double value; // Значення дійсного числа

        // Конструктор для ініціалізації дійсного числа
        public RealNumber(double value) {
            this.value = value;
        }

        // Реалізація методів для дійсних чисел
        @Override
        public MyNumber add(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                return new RealNumber(this.value + o.value);
            }
            return null;
        }

        @Override
        public MyNumber subtract(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                return new RealNumber(this.value - o.value);
            }
            return null;
        }

        @Override
        public MyNumber multiply(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                return new RealNumber(this.value * o.value);
            }
            return null;
        }

        @Override
        public MyNumber divide(MyNumber other) {
            if (other instanceof RealNumber) {
                RealNumber o = (RealNumber) other;
                if (o.value != 0) {
                    return new RealNumber(this.value / o.value);
                }
                System.out.println("Помилка: Ділення на нуль!");
                return null;
            }
            return null;
        }

        // Метод для виводу значення
        @Override
        public String toString() {
            return Double.toString(value);
        }
    }

    // Головний метод для запуску програми
    public static void main(String[] args) {
        System.out.println("Лабораторна робота 3 - Iнтерфейси та методи");

        // Створюємо об'єкти цілих чисел
        MyNumber intNum1 = new IntegerNumber(10);
        MyNumber intNum2 = new IntegerNumber(20);

        // Створюємо об'єкти дійсних чисел
        MyNumber realNum1 = new RealNumber(5.5);
        MyNumber realNum2 = new RealNumber(2.2);

        // Виконуємо арифметичні операції з цілими числами
        System.out.println("Сума цiлих чисел: " + intNum1.add(intNum2));
        System.out.println("Рiзниця цiлих чисел: " + intNum1.subtract(intNum2));

        // Виконуємо арифметичні операції з дійсними числами
        System.out.println("Добуток дiйсних чисел: " + realNum1.multiply(realNum2));
        System.out.println("Частка дiйсних чисел: " + realNum1.divide(realNum2));

        // Перевірка методів toString
        System.out.println("Цiле число 1: " + intNum1);
        System.out.println("Дiйсне число 1: " + realNum1);
    }
}
