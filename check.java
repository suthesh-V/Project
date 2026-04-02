import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner to = new Scanner(System.in);
        System.out.print("Enter a Intiger= ");

        try{
            if(!to.hasNextInt()){
                System.out.println("The number invalid please enter a valid number");
                return;
            }
            int num = to.nextInt();

            if(num > 0){
                System.out.println("The number is positive");
            }
            else if(num < 0){
                System.out.println("The number is negative");
            }
            else{
                System.out.println("The number is zero");
            }
        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            to.close();
        }
    }
}
