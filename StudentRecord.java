import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);

        System.out.println("UNIVERSITY STUDENT RECORD SYSTEM");

        System.out.print("Enter Student ID: ");
        String  id = st.nextLine();

        System.out.print("Enter Student Name: ");
        String name = st.nextLine();

        System.out.print("Enter Course: ");
        String course = st.nextLine();

        System.out.println("Enter Branch and Specalization:");
        String branch = st.nextLine();

        System.out.print("Enter Semester: ");
        String  semester = st.nextLine();

        System.out.print("Enter Attendance(%) : ");
        double attendance = st.nextDouble();

        System.out.print("Enter Marks: ");
        double marks = st.nextDouble();

        // Calculate grade
        char grade;

        if (marks>95)
            grade = 'S';
        else if (marks >= 90)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else if(marks>=50)
            grade = 'E';
        else
            grade = 'F';

        // Calculate result
        String result;

        if (marks >= 40 && attendance >= 75)
            result = "PASS";
        else
            result = "FAIL";

        // Display student record
        System.out.println("----------------------------");
        System.out.println("       STUDENT REPORT");
        System.out.println("----------------------------");

        System.out.println("Student ID   : " + id);
        System.out.println("Name         : " + name);
        System.out.println("Course       : " + course);
        System.out.println("Branch and Sspecalization:"+branch);
        System.out.println("Semester     : " + semester);
        System.out.println("Attendance   : " + attendance + "%");
        System.out.println("Marks        : " + marks);
        System.out.println("Grade        : " + grade);
        System.out.println("Result       : " + result);

        System.out.println("----------------------------");

        st.close();
    }
}