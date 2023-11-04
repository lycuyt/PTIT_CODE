/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J07076_SapXepMaTran {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            String s = sc.nextLine();
            int n = Integer.parseInt(s.split("\\s+")[0]);
            int m = Integer.parseInt(s.split("\\s+")[1]);
            int i = Integer.parseInt(s.split("\\s+")[2]);
            
            String k =  sc.nextLine();
            String[] h = k.split("\\s+");
            int p = 0;
            int[][] a = new int[105][105];
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < m; l++) {
                    a[j][l] = Integer.parseInt(h[p]);
                    p++;
                }
            }
      
            for (int j = 0; j < m; j++) {
                if(j==i-1)
                {
                    for (int l = 0; l < n-1; l++) {
                        for (int o = l+1; o < n; o++) {
                            if(a[l][j] > a[o][j]){
                                int tmp = a[l][j];
                                a[l][j] = a[o][j];
                                a[o][j] = tmp;
                            }
                        }
                    }
//                    for (int l = 0; l < n; l++) {
//                        System.out.print(a[l][j] +" ");
//                    }
                    break;
                }
            }
            for (int j = 0; j < n; j++) {
                
                for (int l = 0; l < m; l++) {
                    System.out.print(a[j][l]+" ");
                }
                System.out.println();
            }
        }
    }
}
