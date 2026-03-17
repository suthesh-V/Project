import java.util.Scanner;

public class DoWhileTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();

        int i = 1;  // counter starts from 1

        // do-while loop
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);  // loop runs until i becomes 10

        sc.close();
    }
}
