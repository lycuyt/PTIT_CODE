/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J08012_HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] ke = new int[100001];
        for (int i = 0; i < n -1 ; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            ke[u]++;
            ke[v]++;
        }
        //ton tai 1 cai co bac la n-1, con lai bac 1
        int kt = 0;
        int dem = 0;
        for (int i = 0; i < 100001; i++) {
            if(ke[i] == n-1){
                kt = 1;
            }
            if(ke[i] == 1){
                dem++;
            }
        }
        if(kt == 1 && dem == n-1)
        {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
/*
5
1 2
1 3
1 4
1 5
*/