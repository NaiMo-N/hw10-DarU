import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW14 {
    public static void main(String[] args){
        HashMap<Integer, Integer> map = new HashMap<>(Map.of(
           1, 10,
           2, 20,
           3, 30,
           4, 40
        ));

        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        scanner.nextLine();

        if(map.containsValue(inputValue)){
            System.out.println("exist");
        } else{
            System.out.println("not exist");
        }
    }
}
