import java.util.ArrayList;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> firstList = new ArrayList<>();
        System.out.println("number in first list");
        int finstNumber = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<finstNumber; i++){
            System.out.println((i+1) + " number: " );
            firstList.add(scanner.nextInt());
        }

        ArrayList<Integer> secondList = new ArrayList<>();
        System.out.println("number in second list");
        int secondNumber = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<secondNumber; i++){
            System.out.println((i+1) + " number: ");
            secondList.add(scanner.nextInt());
        }

        if(firstList.equals(secondList)){
            System.out.println("equal!");
        } else{
            System.out.println("not equal!");
        }

        scanner.close();
    }
}
