public class TraverseMatrixInSpiralOrder {
    public static void main(String[] args)
    {
        int[][] matrix={{2, 4, 6, 8},
                        {5, 9,12,16},
                        {2, 11,5, 9},
                        {3, 2, 1, 8}};
        int row= matrix.length;
        int col=matrix[0].length;
        int top=0,bottom=row-1,left=0,right=col-1;
        int dir=0;
        while (left<=right && top<=bottom)
        {
            if(dir==0)
            {
                for (int i = left; i <=right ; i++) {
                    System.out.print(matrix[top][i]+",");
                }
                top++;
            }
            else if(dir==1)
            {
                for (int i = top; i <=bottom ; i++) {
                    System.out.print(matrix[i][right]+",");
                }
                right--;
            }
            else if(dir==2)
            {
                for (int i = right; i >=left ; i--) {
                    System.out.print(matrix[bottom][i]+",");
                }
                bottom--;
            }
            else if(dir==3){
                for (int i =bottom ; i >=top ; i--) {
                    System.out.print(matrix[i][left]+",");
                }
                left++;
            }
            dir=(dir+1)%4;
        }
    }
}
