import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HW13 {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>(Map.of(
                1, "one",
                2,"two",
                3,"three",
                4, "four"
        ));
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(5,"integer");

        map2.putAll(map);
        System.out.println(map);
        System.out.println(map2);
    }
}
