import java.util.Scanner;
public class NumberOfGroups {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int[] arr={3,9,7,4,6,8};
        int x= scan.nextInt();
        int count=0;
        for(int i=0;i< arr.length;i++)
        {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if((arr[i]+arr[j]+arr[k])%x==0)
                    {
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                        count++;
                    }
                }
                if((arr[i]+arr[j])%x==0)
                {
                    System.out.println(arr[i]+","+arr[j]);
                    count++;
                }
            }
        }
        System.out.println("Number of groups:"+count);
    }
}
