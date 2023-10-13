/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class Matrix{
    private int[][] a;

    public Matrix() {
    }

    public Matrix(int[][] a) {
        this.a = a;
    }

   
    public Matrix(int r, int c)
    {
        a = new int[r][c];
    }

    public int[][] getMatrix() {
        return a;
    }
    
    public void nextMatrix(Scanner sc)
    {
        int n= a.length;
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[0].length;j++)
            {
                a[i][j]= sc.nextInt();
            }
        }
    }
    public String mul(Matrix b)
    {
        int n= a.length;
        int m = a[0].length;
        int p = b.getMatrix()[0].length;
        
        int [][] c= new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j]=0;
                for (int k = 0; k < m; k++) {
                    c[i][j]+=a[i][k]*b.getMatrix()[k][j];
                }
            }
        }
        String res = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                res+=c[i][j]+" ";
            }
            res+="\n";
        }
        return res;
    }
    
}
public class J04016_TichHaiDoiTuongMatran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n,m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m,p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
/*
3 4 3
1 2 3 4
4 2 3 1
2 4 1 3
1 1 1
2 2 2
3 3 3
4 4 4
*/