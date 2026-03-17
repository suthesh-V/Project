import java.util.Scanner;
public class Find{
    void evenorodd(int num){
        if(num%2==0){
            System.out.println("Even no.");
        }
        else{
            System.out.println("odd no.");
        }
}
public static void main(String[] args){
    Scanner fun = new Scanner(System.in);
    System.out.print("Enter no.: ");
    int number = fun.nextInt();
    Find obj = new Find();
    obj.evenorodd(number);
}
}