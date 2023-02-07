package be.ephec.java.exercice.e01;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person p = new Person();
        System.out.print("Comment vous appelez-vous ? ");
        p.firstName = sc.nextLine();

        System.out.print("Quel est votre nom de famille ? ");
        p.lastName = sc.nextLine();

        System.out.print("Quel age avez-vous ? ");
        p.age = sc.nextInt();

        p.display();
    }
}
