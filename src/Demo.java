// Demo class
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method: introduce person
    public void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }

    // Method: check if adult
    public boolean isAdult() {
        return age >= 18;
    }


    @Override
    public String toString() {
        return name + " (" + age + " yrs)";
    }
}

