public class exercise4 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int num3;
        int count=30;

        System.out.print(num1 + " " + num2);
        int i;
        for (i=2; i<=count; ++i){
            num3= num2 + num1;
            System.out.print(" " + num3);
            num1=num2;
            num2=num3;
        }
    }
}
