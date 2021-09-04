import java.util.*;
public class Fragment{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        char []s1 = str1.toCharArray();
        char []s2 = str2.toCharArray();
        char []s3 = str3.toCharArray();
        int c1=0,c2=0,c3=0;
        char words1[][]=new char[100][100];
        char words2[][]=new char[100][100];
        char words3[][]=new char[100][100];
        int p=0,q=0,r=0;
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i]==' ')
            {
                p=0;
                c1++;
            }
            if(s1[i]!=' ')
            {
                words1[c1][p] = s1[i];
                p++;
            }
        }
        c1++;
        for(int i=0;i<s2.length;i++)
        {
            if(s2[i]==' ')
            {
                q=0;
                c2++;
            }
            if(s2[i]!=' ')
            {
                words2[c2][q] = s2[i];
                q++;
            }
        }
        c2++;
        for(int i=0;i<s3.length;i++)
        {
            if(s3[i]==' ')
            {
                r=0;
                c3++;
            }
            if(s3[i]!=' ')
            {
                words3[c3][r] =s3[i];
                r++;
            }
        }
        c3++;
        String A[]=new String[words1.length];
        String B[]= new String[words2.length];
        String C[]=new String[words3.length];
        for(int i=0;i<c1;i++)
        {
            A[i]=String.valueOf(words1[i]);
        }
        for(int i=0;i<c2;i++)
        {
            B[i]=String.valueOf(words2[i]);
        }
        for(int i=0;i<c3;i++)
        {
            C[i]=String.valueOf(words3[i]);
        }
        for(int i=0;i<c1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c3;k++)
                {
                    if(A[i].equals(B[j])&&B[j].equals(C[k])&&C[k].equals(A[i]))
                        System.out.print(A[i].trim()+" ");
                }
            }
        }
    }
}
