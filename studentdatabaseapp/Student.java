package studentdatabaseapp;

import java.util.Scanner;

public class Student{

    private String fristName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses ="";
    private int tuitionBalance =0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Constructor: prompt user to enter student's name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.fristName=in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName=in.nextLine();

        System.out.print("1 - Freshman\n 2 - Sophmore\n 3 - Junior\n 4 - Senior\n Enter student grade level: ");
        this.gradeYear=in.nextInt();

        setStudentID();

    }

    // Generate 5-digit unique ID with first number being grade level 

    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear+""+id;
    } 

    // Enroll in courses

    public void enroll() {
        // Get inside loop, user hits Q to quit\
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if( !course.equals("Q") ){
                courses = courses +"\n -> "+course;
                tuitionBalance=tuitionBalance+costOfCourse;
            }
            else {
                break; 
            }
        } while( 1 != 0 );
    }

    // View Balance

    public void viewBalance() {
        System.out.println("Your balance is: $"+tuitionBalance);
    }

    // Pay Tuition

    public void payTuition() {
        viewBalance();
        System.out.print("Please enter the amount you want to pay: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.println("Thank you for your payment of $"+payment);
        viewBalance();
    }


    // Show status

    public String showStatus() {
        return "Name: "+fristName+" "+lastName+
               "\nGrade Level: "+gradeYear+
               "\nStudent ID: "+studentID+
               "\nCourses Enrolled: "+courses+
               "\nBalance: $"+tuitionBalance;
    }

}