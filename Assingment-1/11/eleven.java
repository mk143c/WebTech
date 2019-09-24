import java.util.*;

class Matrix{
    int n,m;
    static Scanner sc = new Scanner(System.in);
    int getRows(){
        System.out.println("Enter number of rows");
        n = sc.nextInt();
        return n;
    }
    int getColumns(){
        System.out.println("Enter number of columns");
        m = sc.nextInt();
        return m;
    }
    int[][] setElements(int a[][]){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }
    void addMatrix(int a[][],int b[][]){
        if(a.length == b.length && a[0].length == b[0].length)
        {
            System.out.println();
            System.out.println("The Added Matrix is:- ");
            int c[][] = new int[a.length][a[0].length];
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++)
                {
                    c[i][j] = a[i][j]+b[i][j];
                }
            }
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[0].length;j++)
                {
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix cannot be added");
        }
    }

    void multiMatrix(int a[][],int b[][]){
        if(a[0].length == b.length){
            System.out.println();
            System.out.println("The Multiplied Matrix is:- ");
            int c[][] = new int[a[0].length][b.length];
            for(int i=0;i<a[0].length;i++){
                for(int j=0;j<b.length;j++){
                    c[i][j] = 0;
                    for(int k=0;k<b.length;k++)
                    {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
            for(int i=0;i<c.length;i++){
                for(int j=0;j<c[0].length;j++)
                {
                    System.out.print(c[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrix cannot be Multiplied");
        }
    }
}

class Demo{
    public static void main(String[] args) {
        int n,m;
        Matrix ma = new Matrix();
        System.out.println("Enter the rows ands columns of 1st matrix");
        n = ma.getRows();
        m = ma.getColumns();
        int a[][] = new int[n][m];
        System.out.println();
        System.out.println("Set Elements of 1st Matrix");
        a = ma.setElements(a);
        Matrix mb = new Matrix();
        System.out.println("Enter the rows ands columns of 2nd matrix");
        n = mb.getRows();
        m = mb.getColumns();
        int b[][] = new int[n][m];
        System.out.println("Set Elements of 2nd Matrix");
        b = mb.setElements(b);

        for(int[] row:a){
            System.out.println(Arrays.toString(row));
        }

        for(int[] row:b){
            System.out.println(Arrays.toString(row));
        }

        ma.addMatrix(a,b);

        ma.multiMatrix(a,b);
    }
}
