import java.util.Scanner;

public class TestMain {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int ZERO = 0;
    public static final String SMALL = "small";
    public static final String NORMAL_ROM = "normal";
    public static final String LUXURY_ROM = "luxury";
    static Scanner sc = new Scanner(System.in);
    static HotelManage hotelManage = new HotelManage();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu: ");
            System.out.println("1. Add n client ");
            System.out.println("2. Show all client ");
            System.out.println("3. Price of client ");
            System.out.println("0. Exit app ");
            System.out.println("Enter choice ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case ONE:
                    System.out.println("Enter amount client ");
                    int amount = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < amount; i++) {
                        addNewHotel();
                    }
                    break;
                case TWO:
                    displayAll();
                    break;
                case THREE:
                    System.out.println("Enter client id ");
                    String clientId = sc.nextLine();
                    hotelManage.priceOfClient(clientId);
                    break;
                case ZERO:
                    System.out.println("goodBye!");
                    System.exit(0);
                    break;
            }

        } while (choice != ZERO);

    }

    public static void addNewHotel() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter name ");
        String name = sc.nextLine();
        System.out.println("Enter birthDay ");
        String birthday = sc1.nextLine();
        System.out.println("Enter peopleId ");
        String peopleId = sc.nextLine();
        System.out.println("Enter amount day rent room ");
        int rentDay = sc1.nextInt();
        String kindOfRom="";
        do {
            System.out.println("Enter Kind of room is small or normal or luxury ");
            kindOfRom = sc.nextLine();
        } while (!testKindOfRom(kindOfRom));
        Person client = new Person(name, birthday, peopleId);
        Hotel hotel = new Hotel(rentDay, kindOfRom, client);
        hotelManage.addNew(hotel);
    }

    public static void displayAll() {
        hotelManage.displayAll();
    }
    public static  boolean testKindOfRom(String kindOfRom){
        boolean test = false;
        switch (kindOfRom){
            case SMALL:
            case NORMAL_ROM:
            case LUXURY_ROM:
                test = true;
        }
        return test;
    }

}
