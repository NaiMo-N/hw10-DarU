
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class HW6 {
    private ArrayList<String> list = new ArrayList<>();
    private Scanner scanner;

    HW6(Scanner scanner){
        this.scanner = scanner;
    }

    public void addCollection(){
        System.out.println("how many colors want to add? ");
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<inputNumber; i++){
            System.out.println("enter color " + (i+1) + ": ");
            String inputName = scanner.nextLine();
            list.add(inputName);
        }
        System.out.println("Done! ");
    }

    public void allCollection(){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // list.forEach(System.out::println);
        // list.forEach(colors -> System.out.println(colors));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HW6 hw6 = new HW6(scanner);

        while(true){
            System.out.println("1) add color \n" +
                    "2) all colors \n" +
                    "3) out");
            int inputNumber = scanner.nextInt();
            scanner.nextLine();

            switch (inputNumber){
                case 1:
                    hw6.addCollection();
                    break;
                case 2:
                    hw6.allCollection();
                    break;
                case 3:
                    System.out.println("system out! ");
                    scanner.close();
                    return;
            }
        }

    }
}
