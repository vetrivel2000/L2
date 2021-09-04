import java.util.Scanner;
public class HugeNumberAdd{
    public static void add(int arr1[],int arr2[],int m,int n)
    {
        int carry=0,i=m-1,j=n-1,k=m-1,s=0;
        int[] sum=new int[m];
        while (j>=0)
        {
            s=arr1[i]+arr2[j]+carry;
            sum[k]=s%10;
            carry=s/10;
            k--;
            i--;
            j--;
        }
        while(i>=0)
        {
            s=arr1[i]+carry;
            sum[k]=s%10;
            carry=s/10;
            i--;
            k--;
        }
        for (int l = 0; l <m ; l++) {
            System.out.print(sum[l]);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int firstDigit= scan.nextInt();
        int[] firstArray=new int[firstDigit];
        for (int i = 0; i <firstDigit ; i++) {
            firstArray[i]= scan.nextInt();
        }
        int secondDigit= scan.nextInt();
        int[] secondArray=new int[secondDigit];
        for (int j = 0; j < secondDigit; j++) {
            secondArray[j]=scan.nextInt();
        }
        if(firstDigit>secondDigit)
        {
            add(firstArray,secondArray,firstDigit,secondDigit);
        }
        else
        {
            add(secondArray,firstArray,secondDigit,firstDigit);
        }
    }
}
