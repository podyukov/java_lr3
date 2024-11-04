import java.util.HashMap;
import java.util.Map;

public class City {
    private String name; // имя города
    protected Map<City, Integer> routes; // хранение маршрутов с уникальными городами назначения

    // Конструктор для создания города без начальных маршрутов
    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    // Метод для добавления маршрута (проверка на существующую дорогу)
    public void addRoute(City destination, int cost) {
        try {

            if (routes.containsKey(destination)) {
                System.out.println("Маршрут уже существует! Используйте 'Обновить маршрут' для обновления.");
            } else {
                routes.put(destination, cost);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    // Метод для обновления стоимости маршрута, если маршрут уже существует
    public void updateRoute(City destination, int newCost) {
        if (routes.containsKey(destination)) {
            routes.put(destination, newCost);
        } else {
            System.out.println("Маршрут не существует! Используйте 'Добавить маршрут' для добавления.");
        }
    }

    // Метод для удаления маршрута
    public void removeRoute(City destination) {
        if (routes.containsKey(destination)) {
            routes.remove(destination);
            System.out.println("Маршрут удален.");
        } else {
            System.out.println("Маршрут не существует.");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.format("Маршруты из города %s:\n", name));
        for (Map.Entry<City, Integer> route : routes.entrySet()) {
            s.append(String.format("%s:%d\n", route.getKey().name, route.getValue()));
        }
        return s.toString();
    }

    public String getName() {
        return name;
    }
}
