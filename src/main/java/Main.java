import com.bogdan.demo.Apple;
import com.bogdan.demo.Box;
import com.bogdan.demo.Orange;

public class Main {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());

        System.out.println("вес яблок: " + appleBox.getWeight());
        System.out.println("вес апельсинов: " + orangeBox.getWeight());

        System.out.println("вес коробки с яблоками равен весу коробки с апельсинами? " + appleBox.compare(orangeBox));

        Box<Apple> emptyAppleBox = new Box<>();
        appleBox.transferFruits(emptyAppleBox);

        System.out.println("коробка куда пересыпали яблоки: " + emptyAppleBox.getWeight());
        System.out.println("коробка откуда пересыпали яблоки: " + appleBox.getWeight());

    }
}
