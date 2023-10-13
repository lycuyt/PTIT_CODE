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

    public void setMatrix(int[][] a) {
        this.a = a;
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
    
    public Matrix trans()
    {
        Matrix c = new Matrix(a[0].length, a.length);
        int [][] b = new int[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        
        c.setMatrix(b);
        return c;
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
public class J04017_TichMaTranVoiMaTranChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
             int n = sc.nextInt(), m = sc.nextInt();
             Matrix a = new Matrix(n,m);
             a.nextMatrix(sc);
             Matrix b = a.trans();
             System.out.println(a.mul(b));
        }
    }
}
/*
1
2  2
1  2
3  4
*/