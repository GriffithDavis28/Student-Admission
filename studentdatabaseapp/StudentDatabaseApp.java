package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        // Ask how many new students are to be added

        System.out.println("Enter number of new students to be enrolled: ");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        Student[] students = new Student[num];

        // Create n number of new students

        for(int n = 0; n < num; n++)
        {
            students[n] =new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].showStatus());            
        }
        
    }
    
}
