import java.util.Scanner;

// Parent Class
class Person {
    String name;
    int age;

    // Constructor of Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child Class (Inheritance)
class Student extends Person {
    int marks;

    // Constructor of Student
    Student(String name, int age, int marks) {
        super(name, age);   // Calling Parent Constructor
        this.marks = marks;
    }

    void checkResult() {
        if (marks >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }

    // Method Overloading - Without bonus
    void calculateGrade() {
        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }

    // Method Overloading - With bonus marks
    void calculateGrade(int bonus) {
        int totalMarks = marks + bonus;

        System.out.println("Marks after bonus: " + totalMarks);

        if (totalMarks >= 80) {
            System.out.println("Grade: A");
        } else if (totalMarks >= 60) {
            System.out.println("Grade: B");
        } else if (totalMarks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}

// Main Class
public class main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        // Object created using constructor
        Student s1 = new Student(name, age, marks);

        System.out.println("\n--- Student Details ---");
        s1.displayDetails();
        s1.checkResult();
        s1.calculateGrade();
        s1.calculateGrade(5);   // Bonus version

        sc.close();
    }
}
// public class main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//         System.out.println("This is a simple Java program.");
//         System.out.println("It prints multiple lines of text to the console.");
//     }
// }
