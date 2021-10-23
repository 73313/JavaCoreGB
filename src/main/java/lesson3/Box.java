package lesson3;


import java.util.ArrayList;

public class Box<T extends Fruit, S> {

    ArrayList<T> boxes;
    S name;

    public Box(S name) {
        boxes = new ArrayList<>();

        this.name = name;
    }

    public S getName() {
        return name;
    }


    public void addFruitToBox(T t) {
        boxes.add(t);
    }


    public double getWeightOfBox() {
        return boxes.get(0).getWeight() * boxes.size();

    }

    public ArrayList<T> getBoxes() {
        return boxes;
    }


    void info() {
        if (boxes.isEmpty()) {
            System.out.println("Коробка"+ " " + getName()+" " + "пуста" );
        } else {
            System.out.println("В коробке" + " "+ getName()+ " "+ " находятся " + boxes.get(0).toString() +
                    " в количестве: " + boxes.size() + " шт. Вес коробки " + " " + getWeightOfBox() + "f");
        }
    }


    public boolean compare(Box<?, ?> box) {
        if (this.getWeightOfBox() == box.getWeightOfBox()) {
            return true;
        } else {
            return false;
        }
    }
    void moveAt(Box<T,S> box) {

        box.getBoxes().addAll(boxes);
        boxes.clear();
    }
}
