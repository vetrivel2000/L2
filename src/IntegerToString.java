import java.util.Scanner;
public class IntegerToString {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int x= scan.nextInt();
        String output="";
        while (x!=0)
        {
            int reminder=x%26;
            if(reminder==0)
            {
                output+='Z';
                x=x/26-1;
            }
            else {
                output+=(char)((reminder-1)+'A');
                x=x/26;
            }
        }
        char[] result=output.toCharArray();
        for (int i = result.length-1; i >=0; i--) {
            System.out.print(result[i]);
        }
    }
}
