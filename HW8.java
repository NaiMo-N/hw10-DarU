import java.util.ArrayList;
import java.util.Scanner;

public class HW8 {
    static ArrayList<Integer> list = new ArrayList<>();
    Scanner scanner;

    HW8(Scanner scanner){
        this.scanner = scanner;
    }

    public void changeSecondWithIndex(){
        int inputIndex = scanner.nextInt();
        scanner.nextLine();

        int helper = inputIndex;
        int helper2 = list.get(1);
        list.set(1, list.get(inputIndex));
        list.set(helper, helper2);

        System.out.println(list);
    }

    public static void main(String[] args){
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println("print index for changing to second index");
        Scanner scanner = new Scanner(System.in);
        HW8 hw8 = new HW8(scanner);

        hw8.changeSecondWithIndex();
    }
}
