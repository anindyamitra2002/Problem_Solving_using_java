import java.util.Scanner;
public class recursion {
    static int facto(int n){
        if(n==0){
            return(1);
        }
        else{
            return (n* facto(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int z = facto(c);
        System.out.println("The factorial of "+c+" is: "+z);
    }
}
