import java.util.Random;

public class MagicBox<T> {
    protected T[] items;
    int maxSize;

    public MagicBox(int maxSize) {
        items = (T[]) new Object[maxSize];
        this.items = items;
        this.maxSize = maxSize;
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println(item + " уже в волшебном боксе! (^_^)");
                return true;
            }
        }
        System.out.println("Добавить " + item + " в волшебный бокс не получится, он уже заполнен!");
        return false;
    }


    public T pick() throws RuntimeException {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                count++;
            }
        }
        if (count != 0) {
            throw new RuntimeException("Волшебная коробочка не полная. Осталось заполнить ячеек: " + count);
        }

        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        System.out.println(items[randomInt]);
        return items[randomInt];
    }
}