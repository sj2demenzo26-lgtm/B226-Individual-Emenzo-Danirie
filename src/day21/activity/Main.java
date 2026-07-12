/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day21.activity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("***************************************");
        System.out.println("*     User Account Registration      *");
        System.out.println("***************************************");
        System.out.println();

        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();

        System.out.print("Enter Middle Name: ");
        String middleName = scan.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();

        System.out.print("Enter Address: ");
        String address = scan.nextLine();

        System.out.print("Enter Email: ");
        String email = scan.nextLine();

        System.out.print("Enter Password: ");
        String password = scan.nextLine();

        // Create object
        UserAccount user = new UserAccount(
                firstName,
                middleName,
                lastName,
                address,
                email,
                password
        );

        System.out.println();
        System.out.println("--- User Account Created ---");

        System.out.println("Full Name: "
                + user.getFirstName() + " "
                + user.getMiddleName() + " "
                + user.getLastName());

        System.out.println("Address: " + user.getAddress());
        System.out.println("Email: " + user.getEmail());

        scan.close();
    }
}
