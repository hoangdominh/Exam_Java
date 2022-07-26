import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n<0){
            return -1;
        } else if ( n ==0 || n==1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên dương n: ");
        int n = scanner.nextInt();
        if (n>=0 && n<=20){
            System.out.print("Tổng của 2 số Fibonacci trước nó là: ");
            System.out.println(fibonacci(n));
        } else {
            System.out.println("Nhập lại!!");
        }
    }
}
