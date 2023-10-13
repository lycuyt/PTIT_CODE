/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codeptit;

/**
 *
 * @author Lycuy
 */
import java.util.Scanner;
public class J01008_PhanTichThuaSoNguyenTo {
    public static Scanner ip = new Scanner ( System.in);
    public static void testcase(long n){
        
        for (int i=2;i<=Math.sqrt(n);i++){
            int cnt=0;
            while(n%i==0){
                cnt++;
                n=n/i;
            }
            if(cnt!=0){
               System.out.printf("%d(%d) ", i, cnt);
            }
            
        }
        if( n!= 1){
            System.out.printf("%d(%d) ", n, 1);
        }
        System.out.println();
            
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        for(int i=1;i<=t;i++){
            long n= ip.nextLong();
            System.out.printf("Test %d: ", i);
            testcase(n);
        }
    }
}
