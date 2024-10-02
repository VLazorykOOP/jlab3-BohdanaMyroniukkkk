public class Main {
    public static void main(String[] args) {
        System.out.println("Lab 3");
        State[] states = new State[3];
        states[0] = new Republic("France", 67000000, "Emmanuel Macron");
        states[1] = new Monarchy("United Kingdom", 66000000, "King Charles III");
        states[2] = new Kingdom("Spain", 47000000, "King Felipe VI");

        for (State state : states) {
            state.Show();
        }
    }
}

class State {
    String name;
    int population;

    public State(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void Show() {
        System.out.println("State: " + name + ", Population: " + population);
    }
}

class Republic extends State {
    String president;

    public Republic(String name, int population, String president) {
        super(name, population);
        this.president = president;
    }

    @Override
    public void Show() {
        System.out.println("Republic: " + name + ", Population: " + population + ", President: " + president);
    }
}

class Monarchy extends State {
    String monarch;

    public Monarchy(String name, int population, String monarch) {
        super(name, population);
        this.monarch = monarch;
    }

    @Override
    public void Show() {
        System.out.println("Monarchy: " + name + ", Population: " + population + ", Monarch: " + monarch);
    }
}

class Kingdom extends Monarchy {
    public Kingdom(String name, int population, String monarch) {
        super(name, population, monarch);
    }

    @Override
    public void Show() {
        System.out.println("Kingdom: " + name + ", Population: " + population + ", Monarch: " + monarch);
    }
}
