import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 20;
        double totalCredit = 0.0;
        double totalGradePoint = 0.0;

        for (int i = 0; i < n; i++) {
            String subjectName = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            double gradePoint = getGradePoint(grade);

            if (!grade.equals("P")) {
                totalCredit += credit;
                totalGradePoint += (credit * gradePoint);
            }
        }

        double majorGPA = totalGradePoint / totalCredit;

        System.out.printf("%.6f", majorGPA);
    }

    public static double getGradePoint(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }
}
