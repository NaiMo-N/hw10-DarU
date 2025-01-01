public class HW2 {
    public enum Weekday{
        MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);

        private final boolean isWeekday;

        Weekday(boolean isWeekday){
            this.isWeekday = isWeekday;
        }

        public boolean isWeekday(){
            return isWeekday;
        }

        public boolean isHoliday(){
            return !isWeekday;
        }
    }

    public static void printMethod(Weekday day){
        if (day.isHoliday()){
            System.out.println(day + " Holiday");
        } else{
            System.out.println(day + " Weekday");
        }
    }

    public static void main(String[] args){
        for(Weekday day : Weekday.values()){
            printMethod(day);
        }
    }
}
