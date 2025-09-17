import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        String item;
//        double price;
//        int quantity;
//        char currency;
//        double total;
//
//        System.out.print("what do you want 🍕   ");
//        item = scanner.nextLine();
//
//        System.out.print("what is the price for each");
//        price = scanner.nextDouble();
//
//        System.out.println("how many do you like");
//        quantity = scanner.nextInt();
//
//        total = price * quantity;
//
//        System.out.println("this is total" + total);
//        scanner.close();

//        VARIABLES & DATA TYPES
        int age = 25;
        double salary = 55000;
        boolean isEmployed = true;
        String name = "Bhanu";

        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Employed: " + isEmployed);

        //OPERATORS
        int a = 10, b = 3;
        System.out.println("Addition: " + (a + b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
        System.out.println("Is a > b? " + (a > b));

//  CONTROL FLOW (if/else)
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }


        // while loop
        int count = 3;
        while (count > 0) {
            System.out.println("Countdown: " + count);
            count--;
        }

        // switch
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }

        // 5. ARRAYS
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element in array: " + numbers[0]);


        // Loop through array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
