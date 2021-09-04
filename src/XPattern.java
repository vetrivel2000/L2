
import java.util.*;
public class XPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for (int j=0;j<str.length();j++)
            {
                if(i==j)
                {
                    System.out.print(str.charAt(i));
                }
                else if(i+j==str.length()-1)
                {
                    System.out.print(str.charAt(str.length()-i-1));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
