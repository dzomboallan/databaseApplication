/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseapplication;

import java.util.Scanner;

/**
 *
 * @author hunnytaggy
 */
public class DatabaseApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // Ask how many users we want to add
        System.out.println("Enter number of new student to enroll");
        Scanner in =  new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student [] students = new Student[numOfStudents];
        
        // Create n number of new students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println( students[i].toString());
        }
    }
    
}
