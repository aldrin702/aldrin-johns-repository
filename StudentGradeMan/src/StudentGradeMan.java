import java.util.Scanner;
public class StudentGradeMan {

    public static void StudentInfo() {
        System.out.print("Student Name: ");
        Scanner sc = new Scanner(System.in);
        String studname = sc.nextLine();

        System.out.print("Student Number: ");
        String studnumber = sc.nextLine();

        System.out.print("Course: ");
        String course = sc.nextLine();

        System.out.print("Year Level: ");
        String yearlevel = sc.nextLine();
    }

    public static double GradeAvg(double grade1, double grade2, double grade3) {
    double avg=0;
    avg = (grade1 + grade2 + grade3) / 3;
    return avg;
    }

    public static String getEquiv(double avg, char choice) {
        String equiv = "";
        
        switch (Character.toUpperCase(choice)) {
            case 'L': case 'l':
                if (avg >= 90) {
                    equiv = "A";
                    System.out.println("Letter Grade: " + equiv);
                } 
                else if (avg >= 83) {
                    equiv = "B";
                    System.out.println("Letter Grade: " + equiv);
                } 
                else if (avg >= 75) {
                    equiv = "C";
                    System.out.println("Letter Grade: " + equiv);
                } 
                else if (avg >= 60) {
                    equiv = "D";
                    System.out.println("Letter Grade: " + equiv);
                } 
                else {
                    equiv = "F";
                    System.out.println("Letter Grade: " + equiv);
                }
                break;
            case 'N': case 'n':
                if (avg >= 96) {
                    equiv = "4.00";
                    System.out.println("Numeric Grade: " + equiv);
                } 
                else if (avg >= 90) {
                    equiv = "3.50";
                    System.out.println("Numeric Grade: " + equiv);
                } 
                else if (avg >= 84) {
                    equiv = "3.00";
                    System.out.println("Numeric Grade: " + equiv);
                } 
                else if (avg >= 77) {
                    equiv = "2.50";
                    System.out.println("Numeric Grade: " + equiv);
                } 
                else if (avg >= 70) {
                    equiv = "2.00";
                    System.out.println("Numeric Grade: " + equiv);
                } 
                else {
                    equiv = "1.00";
                    System.out.println("Numeric Grade: " + equiv);
                }
                break;
            default:
                equiv = "Invalid";
                break;
        }
        return equiv;
        }


    public static String GetRemarks(double avg) {
        if (avg >= 60) {
            return "Passed";
        }
        else {
            return "Failed";
        }
    }

    public static void DisplayResult(double avg) {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.print("\nDisplay Letter Grade or Numeric Grade [L|N]?");
        choice = sc.next().charAt(0);
        System.out.println(getEquiv(avg, choice));
        System.out.printf("Average: %.2f", avg);
        System.out.println("\nRemarks: " + GetRemarks(avg));
    }

    
    public static void main(String args[]) {
        StudentInfo();

        double grade1, grade2, grade3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Grades... ");

        System.out.print("Grade 1: ");
        grade1 = sc.nextDouble();

        System.out.print("Grade 2: ");
        grade2 = sc.nextDouble();

        System.out.print("Grade 3: ");
        grade3 = sc.nextDouble();

        double average = GradeAvg(grade1,grade2,grade3);
        DisplayResult(average);   

        sc.close();
    }

}


    
