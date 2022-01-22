public class SwitchDemo {
    public static void main(String[] args) {
        byte n = 1;
        switch (n) {

            case 1:
                System.out.println("One....");

        }
        // Menu System
        String meal = "sweets";
        switch (meal) {
            default:
                System.out.println("Welcome User");
            case "Pizza":
                System.out.println("Price is 300 Rs");
            case "SoftDrink":
                System.out.println("Soft Drink Price is 50Rs");
            case "sweets":
                System.out.println("Ice Cream Price is 150Rs");
        }

        // int day = 1;
        // if(day == 1){
        // System.out.println("Working Day");
        // }
        // else if(day ==2){
        // System.out.println("Another Working Day");
        // }
        // else{
        // System.out.println("Wrong Day");
        // }
        // int day = 2; // int , byte, short
        String day = "Monday"; // string allowed from java latest
        // final int MONDAY = 1; // constant
        // final int TUESDAY = 2;
        // MONDAY = 2; // Error

        switch (day) {
            case "Monday":
                System.out.println("It is Working Day");
                break; // exit from the switch case
            // case TUESDAY:
            case "Tuesday":
                System.out.println("Another Working Day");
                break;
            case "Wednesday":
                System.out.println("Client Demo Day");
                break;
            // case 4:
            // System.out.println("Testing Day");
            // break;
            // case 5:
            // System.out.println("Casual Day");
            // break;
            // case 6:
            // System.out.println("Half Working Day");
            // break;
            // case 7:
            // System.out.println("Holiday ");
            // break;

            default:
                System.out.println("Invalid Day");
        }
    }
}
