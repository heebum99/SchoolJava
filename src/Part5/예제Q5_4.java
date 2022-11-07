package Part5;

import java.util.Scanner;

class Person {
    static void print() {
        System.out.print("Person");
    }
}

class Student extends Person {
    static void print() {
        System.out.print("Student");
    }
}

class Researcher extends Person {
    static void print() {
        System.out.print("Researcher");
    }
}

class Professor extends Person {
    static void print() {
        System.out.print("Professor");
    }
}

public class 예제Q5_4 {
    static void print(Person p) {
        if (p instanceof Person)
            System.out.print("Person ");
        if (p instanceof Student)
            System.out.print("Student ");
        if (p instanceof Researcher)
            System.out.print("Researcher ");
        if (p instanceof Professor)
            System.out.print("Professor ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.Person, 2.Student, 3.Researcher, 4.Professor >> ");
        int select = scanner.nextInt();
        Person person;

        switch (select) {
            case 1:
                person = new Person();
                print(person);
                break;
            case 2:
                person = new Student();
                print(person);
                break;
            case 3:
                person = new Researcher();
                print(person);
                break;
            case 4:
                person = new Professor();
                print(person);
                break;
            default:
                System.out.println("번호를 다시 입력해주세요.");
                System.exit(0);
        }


    }
}
