import java.io.*;

class AgeNotWithInRangeException extends Exception {
    public String toString() {
        return ("Age is not between 15 and 21. please ReEnter the Age");
    }
}

class Student {
    int roll, age;
    String name, course;

    Student() {
        roll = 0;
        name = null;
        age = 0;
        course = null;
    }

    Student(int r, String n, int a, String c) {
        roll = r;
        course = c;
        name = n;
        try {
            if (a >= 15 && a <= 21)
                age = a;
            else
                throw new AgeNotWithInRangeException();
        } catch (AgeNotWithInRangeException e1) {
            System.out.println(e1);
        }
    }

    void display() {
        System.out.println("roll Name Age Course");
        System.out.println("---------------------");
        System.out.println(roll + " " + name + " " + age + " " + course);
    }
}

class StudentMain {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter roll number: ");
        int roll = Integer.parseInt(br.readLine());
        System.out.print("\nEnter name: ");
        String name = br.readLine();
        System.out.print("\nEnter age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.print("\nEnter course: ");
        String course = br.readLine();
        Student s = new Student(roll, name, age, course);
        s.display();
    }
}