import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = so.nextInt();
        System.out.print("Enter b = ");
        int b = so.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
