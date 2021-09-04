import java.util.Scanner;

public class ReverseEachWords {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String str= scan.nextLine();
        char[] string=str.toCharArray();
        int count=0,j=0;
        char[][] array=new char[100][100];
        for(int i=0;i<str.length();i++)
        {
            if(string[i]==' ')
            {
                count++;
                j=0;
            }
            if(string[i]!=' ')
            {
                array[count][j]=string[i];
                j++;
            }
        }
        count++;
        String[] A=new String[array.length];
        for (int i = 0; i <count ; i++) {
            A[i]=String.valueOf(array[i]);
        }
        for (int i = count-1; i >=0 ; i--) {
            System.out.print(A[i].trim()+" ");
        }
    }
}
