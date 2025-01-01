public class HW1 {
    public enum Colors{
        BLUE,
        GREY,
        GREEN,
        BLACK,
        YELLOW
    }
    public static void main(String[] args){
        for(Colors color : Colors.values()){
            System.out.println(color);
        }
    }
}
