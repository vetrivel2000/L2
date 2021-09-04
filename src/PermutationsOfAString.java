import java.util.Scanner;

public class PermutationsOfAString {
    static Scanner scanner=new Scanner(System.in);
    static String str=scanner.nextLine();
    public static void swap(int i,int j)
    {
        char[] p=str.toCharArray();
        char temp=p[i];
        p[i]=p[j];
        p[j]=temp;
        str=String.valueOf(p);
    }
    public static void permute(int start,int end)
    {
        if(start==end)
        {
            System.out.println(str);
        }
        else
        {
            for (int i = start; i <=end ; i++) {
                swap(start,i);
                permute(start+1,end);
                swap(start,i);
            }
        }
    }
    public static void main(String args[])
    {
        int len=str.length()-1;
        permute(0,len);
    }
}
