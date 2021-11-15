package lesson3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1. Написать метод, который меняет два элемента массива местами. ");
        System.out.println();
        String[] arr = {"56", "78", "hello", "333"};

        System.out.println( Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        System.out.println("Задача2 с фруктами");
        System.out.println();


        Box<Appals, String> box1 = new Box("ЯБЛОКИ 1");
        Box<Appals, String> box4 = new Box("ЯБЛОКИ 2");
        Box<Orange, String> box2 = new Box("АПЕЛЬСИНЫ 1");
        Box<Orange, String> box3 = new Box("АПЕЛЬСИНЫ 2");


        Appals appals1 = new Appals();
        Appals appals2 = new Appals();
        Appals appals3 = new Appals();
        Appals appals4 = new Appals();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        box1.addFruitToBox(appals1);
        box1.addFruitToBox(appals2);
        box1.addFruitToBox(appals3);
        box1.addFruitToBox(appals4);

        box2.addFruitToBox(orange1);
        box2.addFruitToBox(orange2);
        box2.addFruitToBox(orange3);
        box2.addFruitToBox(orange4);


        box3.addFruitToBox(orange1);
        box3.addFruitToBox(orange2);

        box4.addFruitToBox(appals1);
        box4.addFruitToBox(appals2);
        box4.addFruitToBox(appals3);


        box1.info();
        box2.info();
        box3.info();
        box4.info();
        System.out.println();

        System.out.println("Сравнить вес коробок " + box1.getName() + " " + "и " +
                box2.getName() + ":  " + box1.compare(box2));
        System.out.println("Сравнить вес коробок " + box4.getName() + " " + "и " +
                box3.getName() + ":  " + box4.compare(box3));

        System.out.println();
        System.out.println("Пересыпаем фрукты ");
        System.out.println();

        box2.moveAt(box3);
        box1.moveAt(box4);


        box1.info();
        box2.info();
        box3.info();
        box4.info();
    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
