import java.util.Scanner;
public class SimplifyString {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String string= scan.nextLine();
        char[] input=string.toCharArray();
        char letter=input[0];
        int count=0,flag=1,j;
        for(int i=0;i< input.length;i++)
        {
            for (j = i; j <input.length ; j++) {
                if(input[i]==input[j])
                {
                    flag=1;
                    count++;
                }
                else
                {
                    flag=0;
                    break;
                }
            }
            System.out.print(letter+""+count);
            if(flag==0)
            {
                i=j-1;
                letter=input[j];
            }
            if(flag==1)
            {
                break;
            }
            count=0;
        }
    }
}
