import java.util.Scanner;
public class TopDiagonal {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=1;
        int org=n,original=n,loop=n;
        for (int i = 0; i <n ; i++) {
            int element=k;
            for (int j = 0; j <loop ; j++) {
                System.out.print(element+" ");
                element=element+org;
                org--;
            }
            org=original;
            System.out.println();
            k++;
            loop--;
        }
    }
}
