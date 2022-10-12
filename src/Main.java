public class Main {
    public static void main(String[] args) {

        MagicBox<String> magicBox = new MagicBox<>(4);
        magicBox.add("Колесо");
        magicBox.add("Крыло");
        magicBox.add("Капот");
        magicBox.add("Фара");

        System.out.println("Случайный элемент из коробки 1 " + magicBox.pick());

        MagicBox<Integer> magicBox1 = new MagicBox<>(5);
        magicBox1.add(11);
        magicBox1.add(22);
        magicBox1.add(33);
        magicBox1.add(44);
        magicBox1.add(55);

        System.out.println("Случайный элемент из коробки 2 " + magicBox1.pick());


    }
}
