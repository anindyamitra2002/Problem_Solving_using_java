import java.util.Scanner;
public class Division_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int result=0;
        int remainder=1;

        while(dividend >= divisor && remainder > 0){
            if (remainder >= divisor){
                dividend = dividend - divisor;
                result++;
                System.out.println(result);
            }
        }
//        System.out.println(result);
    }
}
