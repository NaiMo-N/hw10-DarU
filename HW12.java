import java.util.HashSet;

public class HW12 {
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        if(hs.isEmpty()){
            System.out.println("пустой");
        } else{
            System.out.println("не пустой " + hs);
        }
    }
}
