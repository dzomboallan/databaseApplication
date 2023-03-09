/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseapplication;

import java.util.Scanner;

/**
 *
 * @author hunnytaggy
 */
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 6000;
    private static int id = 1000;
    
    // Constructor: prompts user to enter students name and year
    public Student(){
       Scanner in = new Scanner(System.in); 
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();
        
        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        
        setStudentId();    
    }
    
    // Generate ID
    private void setStudentId(){
        // Grade level + ID
        id++;
       studentId =  gradeYear +""+id;
    }
    
    // Enroll in courses
    public void enroll(){
        // Get inside a loop, user hits 0
        do{
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else{break;}
        }while(1 != 0);        
    }
    
    // View balance 
    public void viewBalance(){
        System.out.println("Fee balance is: $"+ tuitionBalance);
    }
    
    // Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Payment amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Payment of $: "+ payment+" successful");
        viewBalance();
    }
    
    // Show status
    public String showInfo(){
        return "Name: "+firstName+" "+lastName+"\nGrade Level: "+gradeYear+"\nStudent Id: "+studentId+"\nCourses Enrolled"+courses+"\nBalance: $"+tuitionBalance;
    }
    
}
