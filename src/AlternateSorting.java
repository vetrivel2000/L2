
import java.util.Arrays;
import java.util.Scanner;
public class AlternateSorting {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr =new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i <n ; i++) {
            for (int j = n-1; j >=i+1 ; j--) {
                if(arr[j]>arr[i] && i%2==0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                if(arr[j]<arr[i] && i%2==1)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
