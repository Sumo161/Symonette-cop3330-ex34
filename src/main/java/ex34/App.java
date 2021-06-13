package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Nyles Symonette
 */

public class App {

    // Assignment provided a list, therefore strings are needed
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>(
                Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        printEmployees(employees);


        //
        System.out.print("Enter an employee name to remove: ");
        String employee = inputScanner.nextLine();
        employees.remove(employee);
        printEmployees(employees);

        inputScanner.close();
    }

    private static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are " + employees.size() + " employees:");
        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
