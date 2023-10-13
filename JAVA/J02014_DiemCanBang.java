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
public class J02014_DiemCanBang {
    public static Scanner ip = new Scanner ( System.in);
    public static int slove(int a[], int n)
    {
        int s=0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        int sl=0;
        for(int i=0;i<n;i++){
            s-=a[i];
            int sr=s;
            if(sl==sr){
                return i+1;
            }
            sl+=a[i];
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int t= ip.nextInt();
        while(t-->0)
        {
            int n= ip.nextInt();
            int[] a= new int[n];
            for (int i=0;i<n;i++)
            {
                a[i]=ip.nextInt();
            }
            int k= slove(a, n);
            System.out.println(k);
        }
    }
}
//2
//7
//-7 1 5 2 -4 3 0
//5
//1 2 3 4 5