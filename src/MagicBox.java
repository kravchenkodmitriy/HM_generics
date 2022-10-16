import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public MagicBox(int sizeBox) {
        items = (T[]) new Object[sizeBox];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        System.out.println("Места в коробченке нет");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("В коробке еще есть место, можно добавить " + (items.length - i));
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        return items[randomInt];

    }
}
