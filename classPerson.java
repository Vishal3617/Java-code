class Person {  
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Employee extends Person {
    private int employeeId;

    public Employee(String name, int age, int employeeId) {
        super(name, age); // Call the superclass constructor to initialize name and age
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

public class classPerson {
    public static void main(String[] args) {
        Employee employee = new Employee("Vishal", 23, 512);

        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
