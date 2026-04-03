import java.io.*;
class one{
    int a,b,c;
    public void output1(){
        a=10;
        b=25;
        c=a+b;
        System.out.println("Addition:"+c);
    }
    }
    class two extends one{
        public void output2(){
            a=25;
            b=35;
            c=a*b;
            System.out.println("Multiplication:"+c);
        }
    }
public class inheritance {
    public static void main(String args[]) {
        two obj = new two();
        obj.output1();
        obj.output2();
    }
}
