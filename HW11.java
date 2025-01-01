import java.util.HashSet;

public class HW11 {

    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        hs2.add(1);
        hs2.add(4);
        hs2.add(3);
        hs2.add(5);

        // для сохранение одиноковых елементов hs и hs2
        HashSet<Integer> hsSameNum = new HashSet<>();

        System.out.println(hs);
        System.out.println(hs2);
        int count = 0;
        for(Integer i : hs){
            if(hs2.contains(i)){
                count++;
                // сохранение
                hsSameNum.add(i);
            } else{
                count--;
            }
        }
        if(count == hs.size()){
            System.out.println("equal: true");
        } else{
            System.out.println("equal: false \n" +
                    "same elements: " + hsSameNum);
        }

    }
}
