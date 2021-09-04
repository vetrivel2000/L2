
import java.util.*;
public class FactorsBasedSorting {
    public static int findNoOfFactors(int num)
    {
        int c=1;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        int[] count=new int[n];
        int temp;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            int c=findNoOfFactors(arr[i]);
            count[i]=c;
        }
        for (int i = 0; i < count.length; i++) {
            for (int j = i+1; j < count.length; j++) {
                if(count[i]<count[j])
                {
                    temp=count[i];
                    count[i]=count[j];
                    count[j]=temp;
                    temp=arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
