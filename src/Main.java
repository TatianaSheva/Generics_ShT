public class Main {
    public static void main(String[] args) {

        MagicBox<String> garryPotter = new MagicBox<>(5);

        garryPotter.add("Гарри Поттер");
        garryPotter.add("Рон Уизли");
        garryPotter.add("Гермиона Грейнджер");
        garryPotter.add("Невил Долгопупс");
        garryPotter.add("Профессор МакГонагал");
        garryPotter.add("Том Реддл - он же Волан де Морт");

        garryPotter.pick();

        MagicBox<Integer> numAvtoRegion = new MagicBox<>(5);

        numAvtoRegion.add(23);
        numAvtoRegion.add(26);
        numAvtoRegion.add(11);
        numAvtoRegion.add(15);
        numAvtoRegion.add(77);
        //numAvtoRegion.add(95);

        numAvtoRegion.pick();

    }
}


//В Main продемонстрируйте работу класса, создайте для этого магическую коробку
// для строк и вторую для чисел и продемонстрируйте на них работу методов.