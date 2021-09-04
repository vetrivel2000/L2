import java.util.*;
public class SortTheDates {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of dates:");
        int n= scan.nextInt();
        String[] date =new String[n];
        StringBuilder s= new StringBuilder();
        long[] l=new long[n];
        for (int i = 0; i <n ; i++) {
            date[i]= scan.next();
        }
        for (int i = 0; i < date.length ; i++) {
            String[] newArray=date[i].split("/");
            for (int j = newArray.length-1; j >=0 ; j--) {
                s.append(newArray[j]);
            }
            l[i]=Long.parseLong(s.toString());
            s = new StringBuilder();
        }
        for (int i = 0; i < date.length ; i++) {
            for (int j = i+1; j < date.length ; j++) {
                if (l[i]>l[j])
                {
                    long temp1=l[i];
                    l[i]=l[j];
                    l[j]=temp1;
                    String temp=date[i];
                    date[i]=date[j];
                    date[j]=temp;
                }
            }
        }
        for (int i = 0; i < date.length ; i++) {
            System.out.println(date[i]);
        }
    }
}
