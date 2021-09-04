
import java.util.*;
public class NumberOfGrandSons {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String[][] array ={{"luke","shaw"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
        int rowLength=array.length;
        String x= sc.nextLine();
        String s = null;
        int count=0;
        for(int i=0;i<rowLength;i++)
        {
            if(array[i][1].equals(x))
            {
                s=array[i][0];
            }
        }
        for (int i=0;i<rowLength;i++)
        {
            if(array[i][1].equals(s))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
