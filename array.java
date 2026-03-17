import java.util.Scanner;
public class array {
    public static void main(String args[]){
        int[] score = new int[5];
        Scanner van = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        score[0] = van.nextInt();
        score[1] = van.nextInt();
        score[2] = van.nextInt();
        score[3] = van.nextInt();
        score[4] = van.nextInt();
        int sum = score[0]+score[1]+score[2]+score[3]+score[4];
        System.out.print("sum="+sum);
    }
    
}
