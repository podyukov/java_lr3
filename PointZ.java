import java.util.InputMismatchException;
import java.util.Scanner;

public class PointZ extends Point{
    private int z = 0;
    public PointZ() {
        super(); // вызываем конструктор родительского класса
        Scanner sz = new Scanner(System.in);
        try {
            System.out.print("Введите y: ");
            z = sz.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные! Будет заменено на 0!\n");
        }
    }

    public PointZ(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("{%d;%d;%d}", getX(), getY(), z);
    }
}
