import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double sum = 0;
        double count = 0;

        System.out.println("Enter student grades, enter the letter S to stop ");

        while(true) {
            String num = sc.nextLine();

            if(num.equalsIgnoreCase("S")){
                break;
            }

        }

    }
}
