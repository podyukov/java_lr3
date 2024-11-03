import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean bexit = true;
        while (bexit) {
            Scanner scannernn = new Scanner(System.in);
            System.out.print("\n> Введите номер задания (1.1 это 11) (0 для выхода): ");
            try {
                int nn = scannernn.nextInt();
                System.out.println();
                switch (nn) {
                    case 0: {
                        System.out.println("До свидания!");
                        bexit = false;
                        break;
                    }
                    case 35: { // задание "трёхмерная точка"
                        System.out.println("Введите точку");
                        Scanner scanner = new Scanner(System.in);
                        int ap = 1; // количество точек
                        PointZ[] point = new PointZ[ap];
                        for (int i = 0; i < ap; i++) {
                            System.out.println(String.format("Начинайте вводить %d точку (целое число)", i+1));
                            point[i] = new PointZ();
                        }
                        System.out.println("Координаты введены успешно!");
                        for (int i = 0; i < ap; i++) {
                            System.out.println(String.format("Точка %d: %s", i+1, point[i]));
                        }
                        break;
                    }
                    case 43: {
                        Bird sparrow = new Sparrow(); // воробей
                        Bird cuckoo = new Cuckoo(); // кукушка
                        Bird parrot = new Parrot("Привет!"); // попугай
                        sparrow.sing();
                        cuckoo.sing();
                        parrot.sing();
                        break;
                    }
                    case 73: {
                        System.out.println("Задание 7.3 оформлено другим проектом,");
                        System.out.println("так как там в Main передаются параметры из командной строки");
                        break;
                    }
                    default: {
                        System.out.println("Неверный номер задачи!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Введены некорректные данные!");
            }
        }
    }
}