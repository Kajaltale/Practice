package Model;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s2 = new Student(sc.nextLine(), sc.nextLine());
        Student s1 = new Student("bhopal" ,"mahima");
        Address a1 = new Address(60,70);
        System.out.println(s1.toString());
        System.out.println(a1.toString());
        System.out.println(s2.toString());

    }
}
