import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num= sc.nextInt();

        if(num%2!=0 || num%3!=0) {
            System.out.println(num + " is a prime number.");
        } else{
            System.out.println(num + " is not a prime number.");
        }
    }
}
