import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the no.of elements");
        int n= scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            array[i]= scan.nextInt();
        }
        for (int i = 0; i <n/2 ; i++) {
            int t=array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=t;
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
