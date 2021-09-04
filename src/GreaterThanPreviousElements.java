public class GreaterThanPreviousElements {
    public static void main(String[] args)
    {
        int[] arr={4,7,3,2,5,9,54,34,87,34,37,56};
        int max=arr[0];
        System.out.print(arr[0]+" ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}


