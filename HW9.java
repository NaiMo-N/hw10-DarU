import java.util.LinkedList;

public class HW9 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}