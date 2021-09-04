public class FoundMatrix {
    public static void main(String[] args)
    {
        int[][] arr1={{4,5,9},
                      {1,3,5},
                      {8,2,4}};
        int[][] arr2={{3,5},
                      {2,4}};
        int x=0,y=0,c=0;
        int N= arr1.length;
        int M= arr2.length;
        int flag=0;
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <N ; j++) {
//                System.out.printf("i - %d ; j - %d\nx - %d ; y - %d\n\n" , i,j,x,y);
                if(x>=M)
                {
                    break;
                }
                if(arr1[i][j]==arr2[x][y])
                {
                    c++;
                    if(y<M)
                        y++;
                    if(y>=M)
                    {
                        x++;
                        y=0;
                    }
                    if(c==M*M)
                    {
                        flag=1;
                    }
                }
            }
        }
        if(flag==1)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}
