import java.util.Arrays;
public class NumberOfOccurrences {
    public static void main(String[] args)
    {
        int[] array={2, 3, 2, 6, 1, 6, 2};
        int count=0,j;
        Arrays.sort(array);
        for (int i = 0; i < array.length ; i++) {
            for ( j = i; j < array.length; j++) {
                if(array[i]==array[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            System.out.println(array[i]+"-"+count);
            i=j-1;
            count=0;
        }
    }
}
