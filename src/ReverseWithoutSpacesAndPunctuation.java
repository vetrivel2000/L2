import java.util.Scanner;

public class ReverseWithoutSpacesAndPunctuation {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine(); /*A man, in the boat says : I see 1-2-3 in the sky */
        int length=str.length();
        int start =0;
        int end=length-1;
        char[] p=str.toCharArray();
        while(start<end)
        {
            if(!((p[start]>='a'&&p[start]<='z')||(p[start]>='0'&&p[start]<='9')||(p[start]>='A'&&p[start]<='Z')))
            {
                start++;
            }
            else if(!((p[end]>='a'&&p[end]<='z')||(p[end]>='0'&&p[end]<='9')||(p[end]>='A'&&p[end]<='Z')))
            {
                end--;
            }
            else
            {
                char temp=p[start];
                p[start]=p[end];
                p[end]=temp;
                start++;
                end--;
            }
        }
        System.out.println(String.valueOf(p));
    }
}