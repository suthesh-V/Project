import java.util.Scanner;
public class evenorodd {
    public static void main(String[] args) {
        Scanner dot = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = dot.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}