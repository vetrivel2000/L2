import java.util.Scanner;

public class SwapWithoutTemp {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
