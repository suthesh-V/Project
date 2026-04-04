import java.util.Scanner;
public class multiple {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = op.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
