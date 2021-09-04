import java.util.Scanner;

public class XOPattern {
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int row = scan.nextInt();
        int col= scan.nextInt();
        char[][] matrix= new char[row][col];
        int top=0,bottom=row-1,left=0,right=col-1;
        int dir=0;
        char c='X';
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
            else {
                for (int i =bottom ; i >=top ; i--) {
                    matrix[i][left]=c;
                }
                left++;
                dir=0;
            }
            if(dir==0)
            {
                c = (c == 'O')? 'X': 'O';
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}