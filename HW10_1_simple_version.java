
import java.util.LinkedList;

public class HW10_1_simple_version {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(12);
        list.add(13);
        list.add(20);
        list.add(14);

        System.out.println("swapping 12 - 20");
        System.out.println(list);
        swapElements(list, 12, 20);
        System.out.println(list);
    }

    public static void swapElements(LinkedList<Integer> list, int x, int y) {
        int indexX = list.indexOf(x);
        int indexY = list.indexOf(y);

        list.set(indexX, y);
        list.set(indexY, x);
    }
}

