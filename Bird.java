import java.util.Random;

public abstract class Bird {
    abstract void sing();
}

class Sparrow extends Bird { // воробей
    @Override
    void sing() {
        System.out.println("чирик");
    }
}

class Cuckoo extends Bird { // кукушка
    @Override
    void sing() {
        Random random = new Random();
        int times = random.nextInt(10) + 1;
        for (int i = 0; i < times; i++) {
            System.out.println("ку-ку");
        }
    }
}

class Parrot extends Bird { // попугай
    private String text;

    public Parrot(String text) {
        this.text = text;
    }

    @Override
    void sing() {
        Random random = new Random();
        int n = random.nextInt(text.length()) + 1; // Случайное количество символов (минимум 1)
        System.out.println(text.substring(0, n));
    }
}
