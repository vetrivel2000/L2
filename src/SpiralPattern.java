import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int[][] matrix= new int[n][n];
        int top=0,bottom= n -1,left=0,right=n-1;
        int dir=0;
        int c= n;
        while (left<=right && top<=bottom)
        {
            if(dir==0)
            {
                for (int i = left; i <=right ; i++) {
                    matrix[top][i]=c;
                }
                top++;
                dir=1;
            }
            else if(dir==1)
            {
                for (int i = top; i <=bottom ; i++) {
                    matrix[i][right]=c;
                }
                right--;
                dir=2;
            }
            else if(dir==2)
            {
                for (int i = right; i >=left ; i--) {
                    matrix[bottom][i]=c;
                }
                bottom--;
                dir=3;
            }
            else if(dir==3){
                for (int i =bottom ; i >=top ; i--) {
                    matrix[i][left]=c;
                }
                left++;
                dir=0;
            }
            if(dir==0)
            {
                c--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
