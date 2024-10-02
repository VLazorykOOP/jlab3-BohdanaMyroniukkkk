public class Main {
    // Головний клас програми

    public static void main(String[] args) {
        // Головний метод, з якого починається виконання програми
        System.out.println("Lab 3"); // Виводить назву лабораторної роботи

        State[] states = new State[3]; // Створює масив з 3-х елементів типу State

        // Ініціалізує масив з конкретними об'єктами класів-похідних
        states[0] = new Republic("France", 67000000, "Emmanuel Macron");
        states[1] = new Monarchy("United Kingdom", 66000000, "King Charles III");
        states[2] = new Kingdom("Spain", 47000000, "King Felipe VI");

        // Проходить циклом по масиву states
        for (State state : states) {
            state.Show(); // Викликає метод Show() для кожного елемента масиву
        }
    }
}

class State {
    // Базовий клас для всіх типів держав
    String name; // Назва держави
    int population; // Населення держави

    // Конструктор для ініціалізації поля name і population
    public State(String name, int population) {
        this.name = name; // Присвоює значення назви
        this.population = population; // Присвоює значення населення
    }

    // Метод для виводу інформації про державу
    public void Show() {
        System.out.println("State: " + name + ", Population: " + population);
    }
}

class Republic extends State {
    // Похідний клас для республік
    String president; // Президент республіки

    // Конструктор для ініціалізації полів базового класу і поля president
    public Republic(String name, int population, String president) {
        super(name, population); // Викликає конструктор базового класу
        this.president = president; // Присвоює значення президента
    }

    // Перевизначений метод Show() для виводу інформації про республіку
    @Override
    public void Show() {
        System.out.println("Republic: " + name + ", Population: " + population + ", President: " + president);
    }
}

class Monarchy extends State {
    // Похідний клас для монархій
    String monarch; // Монарх

    // Конструктор для ініціалізації полів базового класу і поля monarch
    public Monarchy(String name, int population, String monarch) {
        super(name, population); // Викликає конструктор базового класу
        this.monarch = monarch; // Присвоює значення монарха
    }

    // Перевизначений метод Show() для виводу інформації про монархію
    @Override
    public void Show() {
        System.out.println("Monarchy: " + name + ", Population: " + population + ", Monarch: " + monarch);
    }
}

class Kingdom extends Monarchy {
    // Похідний клас для королівств

    // Конструктор
    public Kingdom(String name, int population, String monarch) {
        super(name, population, monarch); // Викликає конструктор базового класу Monarchy
    }

    // Перевизначений метод Show() для виводу інформації про королівство
    @Override
    public void Show() {
        System.out.println("Kingdom: " + name + ", Population: " + population + ", Monarch: " + monarch);
    }
}
