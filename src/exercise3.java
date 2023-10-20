import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double highestgrade = Integer.MIN_VALUE;
        double lowestgrade = Integer.MAX_VALUE;

        System.out.println("Enter student grades, enter the letter S to stop.");
        while (true) {
            String grade = sc.nextLine();
            if (grade.equalsIgnoreCase("S")) {
                break;
            }
            boolean isValid = true;

            for (char i : grade.toCharArray()) {
                if (!Character.isDigit(i)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                double grades = Double.parseDouble(grade);

                if (grades > highestgrade) {
                    highestgrade = grades;
                }
                if (grades < lowestgrade) {
                    lowestgrade = grades;
                }
            } else {
                System.out.println("Invalid input");
            }
        }

        if (highestgrade == Integer.MIN_VALUE && lowestgrade == Integer.MAX_VALUE) {
            System.out.println("No valid grades entered.");
        } else {
            System.out.println("The highest grade is " + highestgrade);
            System.out.println("The lowest grade is " + lowestgrade);

        }
    }
}

