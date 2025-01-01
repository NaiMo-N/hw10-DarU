// HW5
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PhoneNumbers {
    private HashMap<String, Integer> map = new HashMap<>();
    private Scanner scanner;

    PhoneNumbers(Scanner scanner){
        this.scanner = scanner;
    }

    public void addContact(){
        System.out.println("input name: ");
        String inputName = scanner.nextLine();

        System.out.println("input number: ");
        int inputNumber = scanner.nextInt();

        map.put(inputName, inputNumber);
        System.out.println("Done!");
    }

    public void allContact(){
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("name: " + entry.getKey() + ", number: " + entry.getValue());
        }
        // for(Map.Entry<String, Integer> entry : map.entrySet()){}
    }

    public void changeContactNumberByName(){
        System.out.println("input name for update: ");
        String inputName = scanner.nextLine();
        if(map.containsKey(inputName)){
            System.out.println("enter new number: ");
            int inputNumber = scanner.nextInt();
            scanner.nextLine();

            map.put(inputName, inputNumber);
            System.out.println("Done! ");
        }
    }

    public void searchContact(){
        System.out.println("name for search: ");
        String inputName = scanner.nextLine();
        if(map.containsKey(inputName)){
            System.out.println("find a contact with name " + inputName + ", number: " + map.get(inputName));
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PhoneNumbers phoneNumbers = new PhoneNumbers(scanner);

        while (true){
            System.out.println("1) add new contact \n" +
                    "2) all contact \n"  +
                    "3) change the contact \n" +
                    "4) search by name \n" +
                    "5) out");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    phoneNumbers.addContact();
                    break;
                case 2:
                    phoneNumbers.allContact();
                    break;
                case 3:
                    phoneNumbers.changeContactNumberByName();
                    break;
                case 4:
                    phoneNumbers.searchContact();
                    break;
                case 5:
                    System.out.println("system ended");
                    scanner.close();
                    return;
            }
        }
    }
}
