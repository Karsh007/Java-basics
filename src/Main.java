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





        // 7. EXCEPTION HANDLING
        try {
            int result = 10 / 0; // risky code
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        } finally {
            System.out.println("This block always runs.");
        }


        // Creating  objects
        Person p1 = new Person("Bhanu", 25);
        Person p2 = new Person("Alice", 30);
        Person p3 = new Person("Bob", 28);

        //using Methods
        p1.introduce();
        System.out.println(p2.name + " adult? " + p2.isAdult());


        // 1. LIST (allows duplicates, keeps order)
        java.util.List<Person> peopleList = new java.util.ArrayList<>();
        peopleList.add(p1);
        peopleList.add(p2);
        peopleList.add(p3);
        peopleList.add(p1); // duplicate allowed
        System.out.println("List: " + peopleList);

        // 2. SET (no duplicates, no order guarantee)
        java.util.Set<Person> peopleSet = new java.util.HashSet<>();
        peopleSet.add(p1);
        peopleSet.add(p2);
        peopleSet.add(p3);
        peopleSet.add(p1); // duplicate ignored
        System.out.println("Set: " + peopleSet);

        // 3. MAP (key-value pairs)
        java.util.Map<Integer, Person> peopleMap = new java.util.HashMap<>();
        peopleMap.put(1, p1);
        peopleMap.put(2, p2);
        peopleMap.put(3, p3);
        peopleMap.put(4, p1); // keys unique, values can repeat
        System.out.println("Map: " + peopleMap);
    }

}
