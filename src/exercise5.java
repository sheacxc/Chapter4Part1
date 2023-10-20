import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num= sc.nextInt();

        int factorial = 1;

        if( num == 0 || num == 1){
            factorial = 1;
        } else {
            for (int i = 2; i <= num; i++){
                factorial *=i;
            }
        }
        System.out.println( num + "!= " + factorial);
    }
}
