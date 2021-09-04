import java.util.Scanner;
public class OneToNDigits {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int no_Of_Digits=0;
        for (int i = 1; i <=n ; i=i*10) {
            no_Of_Digits+=(n-i+1);
        }
        System.out.println(no_Of_Digits);
    }
}
