import java.util.Scanner;

public class code {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Array size:");
        int n = obj.nextInt(
        int[] num = new int[n];
        
        System.out.println("Enter elements:");

        for(int i = 1; i < num.length; i++){
            if (num[i] == num[i-1]){
            System.out.println("True");
            }
        else{
            System.out.println("false");
        }
        }
    }
}
